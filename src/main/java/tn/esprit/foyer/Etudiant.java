package tn.esprit.foyer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity

public class Etudiant implements Serializable {


    //properties
    @Id
    private Long idEtudiant;
    private String NomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;

    public Etudiant() {
    }
}
