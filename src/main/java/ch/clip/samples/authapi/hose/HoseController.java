package ch.clip.samples.authapi.hose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hosen")
public class HoseController {

    @Autowired
    HoseRepository hoseRepository;

    public HoseController(HoseRepository hoseRepository) {
        this.hoseRepository = hoseRepository;
    }

    @GetMapping
    public List<Hose> getHosen(){
        return hoseRepository.findAll();
    }
}
