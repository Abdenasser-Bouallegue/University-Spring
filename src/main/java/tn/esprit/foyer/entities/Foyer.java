package tn.esprit.foyer.entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity

public class Foyer implements Serializable {



        //properties
        @Id
        private Long idFoyer;
        private String NomFoyer;
        private Long Capacity;

        public Foyer() {
        }
        @OneToOne(mappedBy="foyer")
        private University university;
        @OneToMany( mappedBy="foyer")
        private Set<Bloc> blocs;


}
