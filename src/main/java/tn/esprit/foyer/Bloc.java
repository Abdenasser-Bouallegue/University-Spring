package tn.esprit.foyer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.Set;

@Entity

public class Bloc implements Serializable {


    //properties
    @Id
    private Long idBloc;
    private String NomBloc;
    private Long CapacityBloc;

    public Bloc() {
    }
    @ManyToOne
    Foyer foyer;
    @OneToMany( mappedBy="bloc")
    private Set<Chambre> chambres;
}
