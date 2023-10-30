package tn.esprit.foyer.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer implements Serializable {



        //properties
        @Id
        private Long idFoyer;
        private String NomFoyer;
        private Long Capacity;
        private boolean Archived=false;


        public Foyer() {
        }
        @OneToOne(mappedBy="foyer")
        private University university;
        @OneToMany( mappedBy="foyer")
        private Set<Bloc> blocs;


}
