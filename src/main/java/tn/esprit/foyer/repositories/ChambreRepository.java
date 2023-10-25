package tn.esprit.foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.foyer.entities.Chambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    @Query("SELECT c FROM Chambre c " +
            "WHERE c.typeC = 'Double' " +
            "AND c.bloc.idBloc = :blocId")
    List<Chambre> findDoubleRoomsByBlocId(@Param("blocId") Long blocId);
    @Query("SELECT c FROM Chambre c " +
            "WHERE c.bloc.idBloc = :blockId " +
            "AND c.bloc.CapacityBloc > :Capacity")
    List<Chambre> findChambresByCapacity(@Param("blockId") Long blockId, @Param("Capacity") Long Capacity);
}

