package tn.esprit.foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
