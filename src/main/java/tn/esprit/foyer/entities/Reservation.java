package tn.esprit.foyer.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity

public class Reservation implements Serializable {


    //properties
    @Id
    private Long idReservation;
    private Date AnneeUniversitaire;
    private Boolean estVlaide;


    public Reservation() {
    }
    @ManyToMany
    private Set<Etudiant> etudiants;
}

