package tn.esprit.foyer;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;


@Entity

public class Chambre implements Serializable {


    //properties
    @Id
    private Long idChambre;
    private Long NumeroChambre;
    public enum TypeChambre {
        Simple, Double, Triple
    }
    @Enumerated(EnumType.ORDINAL)
    private TypeChambre typeC;


    public Chambre() {
    }
    @ManyToOne
    Bloc bloc;
    @OneToMany
    private Set<Reservation> reservations;
}

