package com.formation;

public class Humain {

    private int taille;
    private float masse;
    private String nom;

    public Humain() {
    }

    public Humain(int taille, float masse, String nom) {
        this.taille = taille;
        this.masse = masse;
        this.nom = nom;
    }


    public int getTaille() {



        return taille;
    }

    public void setTaille(int taille) throws MaxException, MinException {

        if (taille < 60) {
            throw new MinException("la valeur saisie " + taille + "est supérieure à 60");
        } else if (taille > 220) {
            throw new MaxException("la valeur saisie " + taille + "est ingérieure à 220");
        } else {
            this.taille = taille;
        }

    }

    public float getMasse() {
        return masse;
    }

    public void setMasse(float masse) throws MinException, MaxException {

        if (masse < 40) {
            throw new MinException("la valeur saisie " + masse + "est supérieure à 40");
        } else if (masse > 130) {
            throw new MaxException("la valeur saisie " + masse + "est ingérieure à 130");
        } else {
            this.masse = masse;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws NameException, MajException {
        if (!nom.matches("^(?i)[a-z]+$"))
            throw new NameException("nom incorrect");

        else if (!nom.matches("^[A-Z]+[a-z]+$"))
            throw new MajException("produit doit commencer par une lettre majuscule");

        else
            this.nom = nom;


    }
}
