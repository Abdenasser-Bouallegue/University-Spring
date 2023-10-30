package tn.esprit.foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.foyer.entities.Bloc;
import tn.esprit.foyer.entities.University;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    //Bloc findByNomBloc(String nom);
    @Query("SELECT b FROM Bloc b " +
            "JOIN b.foyer f " +
            "WHERE f.university = :universityName")
    List<Bloc> findBlocsByUniversityName(@Param ("universityName") String universityName);
}
