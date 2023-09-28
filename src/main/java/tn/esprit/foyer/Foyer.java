package tn.esprit.foyer;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
@Entity

public class Foyer implements Serializable {



        //properties
        @Id
        private Long idFoyer;
        private String NomFoyer;
        private Long Capacity;

        public Foyer() {
        }



}
