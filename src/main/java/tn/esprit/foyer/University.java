package tn.esprit.foyer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Entity

public class University implements Serializable {


    //properties
    @Id
    private Long idUniversity;
    private String NomFoyer;
    private String Adresse;

    public University() {
    }
    @OneToOne 
    private Foyer foyer;
}

