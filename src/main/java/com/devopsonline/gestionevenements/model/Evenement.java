package com.devopsonline.gestionevenements.model;

public class Evenement {
    private Long id;
    private String nom;
    private String date;

    public Evenement() {
    }

    public Evenement(Long id, String nom, String date) {
        this.id = id;
        this.nom = nom;
        this.date = date;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
