package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class ProduitBuilder {
	private String nom;
    private String grade;
    private Categorie categorie;
    private Marque marque;
    private List<Ingredient> ingredients = new ArrayList<>();
    private List<Additif> additifs = new ArrayList<>();
    private List<Allergene> allergenes = new ArrayList<>();
    
    public ProduitBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }
    
    public ProduitBuilder setgrade(String grade) {
    	this.grade=grade;
    	return this;
    }
    
    public ProduitBuilder setCategorie(String categorieNom) {
        this.categorie = new Categorie(categorieNom);
        return this;
    }

    public ProduitBuilder setMarque(String marqueNom) {
        this.marque = new Marque(marqueNom);
        return this;
    }
    
    
    public ProduitBuilder addIngredient(String nom, double qteMilligrammes) {
        this.ingredients.add(new Ingredient(nom, qteMilligrammes));
        return this;
    }
    
    public ProduitBuilder addAdditif(String nom, double qteMilligrammes) {
        this.additifs.add(new Additif(nom, qteMilligrammes));
        return this;
    }
    
    public ProduitBuilder addAllergine(String nom, double qteMilligrammes) {
        this.allergenes.add(new Allergene(nom, qteMilligrammes));
        return this;
    }
    
    
    public Produit build() {
        return new Produit(nom, grade, categorie, marque, ingredients, additifs, allergenes);
    }
}


