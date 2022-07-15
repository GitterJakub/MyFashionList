package ch.clip.samples.authapi.schuhe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schuhe")
public class SchuheController {

    @Autowired
    SchuheRepository schuheRepository;

    public SchuheController(SchuheRepository schuheRepository) {
        this.schuheRepository = schuheRepository;
    }

    @GetMapping
    public List<Schuhe> getSchuhe(){
        return schuheRepository.findAll();
    }

    @GetMapping("/{id}")
    public Schuhe getSchuheById(@PathVariable long id){
        return schuheRepository.findById(id).get();
    }
}
