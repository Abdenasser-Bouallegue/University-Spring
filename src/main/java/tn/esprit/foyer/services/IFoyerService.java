package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Foyer;
import tn.esprit.foyer.entities.University;

import java.util.List;

public interface IFoyerService {


    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer(Foyer f);

    Foyer updateFoyer(Foyer f);

    Foyer retrieveFoyer(long idFoyer);

    void archiverFoyer(long idFoyer);  // Ajoutez un attribut boolean archived dans l'entité Foyer, par défault false et le modifier à true suite à l'exécution de ce service
}