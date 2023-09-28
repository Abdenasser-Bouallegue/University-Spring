package tn.esprit.foyer;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.io.Serializable;


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
}

