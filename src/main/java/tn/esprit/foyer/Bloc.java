package tn.esprit.foyer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity

public class Bloc implements Serializable {


    //properties
    @Id
    private Long idBloc;
    private String NomBloc;
    private Long CapacityBloc;

    public Bloc() {
    }
}
