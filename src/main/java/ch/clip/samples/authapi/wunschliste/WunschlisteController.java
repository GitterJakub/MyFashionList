package ch.clip.samples.authapi.wunschliste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wunschlisten")
public class WunschlisteController {

    @Autowired
    WunschlisteRepository wunschlisteRepository;

    public WunschlisteController(WunschlisteRepository wunschlisteRepository) {
        this.wunschlisteRepository = wunschlisteRepository;
    }

    @GetMapping
    public List<Wunschliste> getWunschlisten(){
        return wunschlisteRepository.findAll();
    }

    @PostMapping
    public void addWunschliste(@RequestBody Wunschliste wunschliste){
        wunschlisteRepository.save(wunschliste);

    }

    @PutMapping("/{id}")
    public void editWunschliste(@PathVariable long id, @RequestBody Wunschliste wunschliste){
        Wunschliste exWunschliste = wunschlisteRepository.findById(id).get();
        Assert.notNull(exWunschliste, "Task not found");
        exWunschliste.setSelectedHosen(wunschliste.getSelectedHosen());
        exWunschliste.setSelectedSchuhe(wunschliste.getSelectedSchuhe());
        exWunschliste.setSelectedShirts(wunschliste.getSelectedShirts());
        wunschlisteRepository.save(exWunschliste);

    }


}
