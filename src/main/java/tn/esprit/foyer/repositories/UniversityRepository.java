package tn.esprit.foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.entities.University;

public interface UniversityRepository extends JpaRepository<University,Long> {
}
