package tn.esprit.foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
