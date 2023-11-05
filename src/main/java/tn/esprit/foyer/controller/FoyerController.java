package tn.esprit.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.foyer.entities.Etudiant;
import tn.esprit.foyer.entities.Foyer;
import tn.esprit.foyer.services.IFoyerService;

@RestController
@AllArgsConstructor
@RequestMapping("Foyer")
public class FoyerController {
    IFoyerService foyerService;
    @GetMapping("/getAllFoyers")
    public Iterable<Foyer> getAllFoyers(){
        return foyerService.retrieveAllFoyers();
    }
}
