package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

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
    @ManyToMany (mappedBy="etudiants")

    private Set<Reservation> reservations;
}
