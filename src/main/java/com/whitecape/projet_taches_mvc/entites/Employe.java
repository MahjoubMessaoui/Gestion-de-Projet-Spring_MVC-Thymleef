package com.whitecape.projet_taches_mvc.entites;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employe implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.TABLE )
    private Long id;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private int mat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public Employe(String nom, String prenom, int mat) {
        this.nom = nom;
        this.prenom = prenom;
        this.mat = mat;
    }

    public Employe() {
    }
}
