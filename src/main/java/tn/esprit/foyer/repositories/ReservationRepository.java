package tn.esprit.foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.foyer.entities.Chambre;
import tn.esprit.foyer.entities.Reservation;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
/*@Query("SELECT c, r.estValide FROM Chambre c , c.reservations r " +
            "WHERE r.estValide = :estValide")
    List<Chambre> findChambresWithReservation(@Param("estValide") boolean estValide);*/
}
