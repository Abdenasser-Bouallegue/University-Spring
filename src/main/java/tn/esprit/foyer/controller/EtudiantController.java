package tn.esprit.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.Etudiant;
import tn.esprit.foyer.services.EtudiantServiceImpl;
import tn.esprit.foyer.services.IEtudiantService;

@RestController
@AllArgsConstructor
@RequestMapping("Etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;
        @GetMapping("/getAllEtudiants")
    public Iterable<Etudiant> getAllEtudiants(){
        return etudiantService.retrieveAllEtudiants();
    }
    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant (@RequestBody Etudiant e){
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }
    @DeleteMapping("/remove/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id")Long etudiantId){
            etudiantService.removeEtudiant(etudiantId);
    }
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e){
            Etudiant etudiant = etudiantService.updateEtudiant(e);
            return etudiant;
    }


}
