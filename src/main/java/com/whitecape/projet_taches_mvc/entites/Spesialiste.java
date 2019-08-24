package com.whitecape.projet_taches_mvc.entites;

import javax.persistence.Entity;

@Entity
public class Spesialiste extends Employe{
    public Spesialiste(String nom, String prenom, int mat) {
        super(nom, prenom, mat);
    }

    public Spesialiste() {
    }
}
