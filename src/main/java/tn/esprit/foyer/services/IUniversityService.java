package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.University;

import java.util.List;

public interface IUniversityService {
    List<University> retrieveAllUniversities();
    University addUniversity (University u);
    University updateUniversity (University u);
    University retrieveUniversity (long idUniversity);
    void removeUniversity  (long idUniversity );
}
