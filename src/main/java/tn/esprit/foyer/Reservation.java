package tn.esprit.foyer;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity

public class Reservation implements Serializable {


    //properties
    @Id
    private Long idReservation;
    private Date AnneeUniversitaire;
    private Boolean estVlaide;


    public Reservation() {
    }
}

