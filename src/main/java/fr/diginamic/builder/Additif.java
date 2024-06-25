package fr.diginamic.builder;

public class Additif {
    private String nom;
    private double qteMilligrammes;

    public Additif(String nom, double qteMilligrammes) {
        this.nom = nom;
        this.qteMilligrammes = qteMilligrammes;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getQteMilligrammes() {
        return qteMilligrammes;
    }

    public void setQteMilligrammes(double qteMilligrammes) {
        this.qteMilligrammes = qteMilligrammes;
    }
}
