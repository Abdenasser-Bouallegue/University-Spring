package tn.esprit.foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.University;
import tn.esprit.foyer.repositories.UniversityRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversityServiceImpl implements IUniversityService{
   UniversityRepository universityRepository;
    @Override
    public List<University> retrieveAllUniversities() {
        return universityRepository.findAll();
    }

    @Override
    public University addUniversity(University u) {
        return universityRepository.save(u);
    }

    @Override
    public University updateUniversity(University u) {
        return universityRepository.save(u);
    }

    @Override
    public University retrieveUniversity(long idUniversity) {
        return universityRepository.findById(idUniversity).get();
    }

    @Override
    public void removeUniversity(long idUniversity) {
        universityRepository.deleteById(idUniversity);

    }
}
