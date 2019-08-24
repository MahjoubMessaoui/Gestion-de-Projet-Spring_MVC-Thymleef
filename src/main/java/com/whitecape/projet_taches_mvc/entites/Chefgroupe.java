package com.whitecape.projet_taches_mvc.entites;

import javax.persistence.Entity;
@Entity
public class Chefgroupe extends Employe {
    public Chefgroupe(String nom, String prenom, int mat) {
        super(nom, prenom, mat);
    }

    public Chefgroupe() {
    }
}
