package com.whitecape.projet_taches_mvc.entites;

import javax.persistence.Entity;

@Entity
public class Chefprojet extends Employe {
    public Chefprojet(String nom, String prenom, int mat) {
        super(nom, prenom, mat);
    }

    public Chefprojet() {
    }
}
