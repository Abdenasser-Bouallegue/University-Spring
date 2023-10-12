package tn.esprit.foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
