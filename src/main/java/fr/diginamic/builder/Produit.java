package fr.diginamic.builder;

import java.util.List;

public class Produit {
    private String nom;
    private String grade;
    private Categorie categorie;
    private Marque marque;
    private List<Ingredient> ingredients;
    private List<Additif> additifs;
    private List<Allergene> allergenes;

    // Constructeur
    public Produit(String nom, String grade, Categorie categorie, Marque marque,
                   List<Ingredient> ingredients, List<Additif> additifs, List<Allergene> allergenes) {
        this.nom = nom;
        this.grade = grade;
        this.categorie = categorie;
        this.marque = marque;
        this.ingredients = ingredients;
        this.additifs = additifs;
        this.allergenes = allergenes;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public void setAdditifs(List<Additif> additifs) {
        this.additifs = additifs;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public void setAllergenes(List<Allergene> allergenes) {
        this.allergenes = allergenes;
    }
}
