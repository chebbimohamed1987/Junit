package com.formation;

public class Nourriture {
    private String nom;
    private int calories;

    public Nourriture() {
    }

    public Nourriture(String nom, int calories) {
        this.nom = nom;
        this.calories = calories;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws Exception {


        if (!nom.matches("^(?i)[a-z]+$"))
            throw new NameException("nom incorrect");

        else if (!nom.matches("^[A-Z]+[a-z]+$"))
            throw new MajException("produit doit commencer par une lettre majuscule");

        else
            this.nom = nom;

    }


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) throws Exception {
        if (calories < 0) {
            throw new MinException("la valeur saisie " + calories + "est négative");
        } else if (calories > 5000) {
            throw new MaxException("la valeur saisie " + calories + "est supérieur à 5000");
        } else {
            this.calories = calories;
        }


    }
}
