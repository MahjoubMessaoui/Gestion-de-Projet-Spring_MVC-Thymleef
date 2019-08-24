package com.whitecape.projet_taches_mvc.entites;

import javax.persistence.Entity;

@Entity
public class Agent extends Employe {

    public Agent(String nom, String prenom, int mat) {
        super(nom, prenom, mat);
    }

    public Agent() {
    }
}
