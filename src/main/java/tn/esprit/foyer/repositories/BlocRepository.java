package tn.esprit.foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    Bloc findByNomBloc(String nom);


}
