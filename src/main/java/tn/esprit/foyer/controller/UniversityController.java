package tn.esprit.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.entities.University;
import tn.esprit.foyer.services.IUniversityService;

@RestController
@AllArgsConstructor
@RequestMapping("University")
public class UniversityController {
    IUniversityService universityService;
    @GetMapping("/getallU")
    public  Iterable<University> getAlluniversitys()
    {
        return universityService.retrieveAllUniversities();
    }

    @PostMapping("/add")
    public  University addEtudiant(@RequestBody University u )
    {
        University university = universityService.addUniversity(u);
        return u ;
    }

    @PutMapping("/update")
    public  University updateuniversity(@RequestBody University u )
    {
        University university = universityService.updateUniversity(u);
        return  u;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteuniversity(@PathVariable("id") long universityId)
    {
        universityService.removeUniversity(universityId);
    }
}
