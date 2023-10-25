package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService  {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Long idEtudiant);

    void removeEtudiant(Long idEtudiant);

}
