package com.whitecape.projet_taches_mvc.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Projet implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String desig;
    private String client;


    @OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
    private List<Taches> taches;

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

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public List <Taches> getTaches() {
        return taches;
    }

    public void setTaches(List <Taches> taches) {
        this.taches = taches;
    }


    public Projet() {


    }

    public Projet(String nom, String desig, String client, List <Taches> taches) {
        this.nom = nom;
        this.desig = desig;
        this.client = client;
        this.taches = taches;
    }
}
