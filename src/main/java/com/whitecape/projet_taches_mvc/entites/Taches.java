package com.whitecape.projet_taches_mvc.entites;

import javax.persistence.*;
import java.io.Serializable;
@Entity

public class Taches implements Serializable {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
     private String nom;

    @ManyToOne(
            fetch = FetchType.LAZY)
    private Projet projet;

    public Projet getProjet() {
        return projet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public Taches(String nom, Projet projet) {
        this.nom = nom;
        this.projet = projet;
    }
}
