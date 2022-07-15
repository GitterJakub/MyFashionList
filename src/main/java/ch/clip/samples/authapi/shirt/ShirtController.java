package ch.clip.samples.authapi.shirt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shirts")
public class ShirtController {
    @Autowired
    private ShirtRepository shirtRepository;

    public ShirtController(ShirtRepository shirtRepository) {
        this.shirtRepository = shirtRepository;
    }

    @GetMapping
    public List<Shirt> getShirts (){
        return shirtRepository.findAll();
    }

    @GetMapping("/{id}")
    public Shirt getShirtById(@PathVariable long id){
        return shirtRepository.findById(id).get();
    }
}
