package com.whitecape.projet_taches_mvc.entites;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Taches implements Serializable {
@Id
@GeneratedValue(strategy =GenerationType.TABLE)
    private Long id;

    @ManyToOne(
            fetch = FetchType.LAZY)
    private Projet projet;

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Taches() {


    }

    public Taches(Projet projet) {
        this.projet = projet;
    }
}
