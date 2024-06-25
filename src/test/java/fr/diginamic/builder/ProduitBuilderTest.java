package fr.diginamic.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProduitBuilderTest {

	@Test
    public void testProduitBuilderNominal() {
        Produit produit = new ProduitBuilder()
                .setNom("Chocolat")
                .setgrade("A")
                .setCategorie("Confiserie")
                .setMarque("Nestlé")
                .addIngredient("Cacao", 70)
                .addAdditif("Lécithine", 0.5)
                .addAllergine("Arachides", 0.1)
                .build();

        assertEquals("Chocolat", produit.getNom());
        assertEquals("A", produit.getGrade());
        assertEquals("Confiserie", produit.getCategorie().getNom());
        assertEquals("Nestlé", produit.getMarque().getNom());
        assertEquals(1, produit.getIngredients().size());
        assertEquals(1, produit.getAdditifs().size());
        assertEquals(1, produit.getAllergenes().size());
    }

    @Test
    public void testProduitBuilderCasAlternatif() {
        Produit produit = new ProduitBuilder()
                .setNom("Chocolat")
                .setgrade("A")
                .setCategorie("Confiserie")
                .setMarque("Nestlé")
                .build();

        assertEquals("Chocolat", produit.getNom());
        assertEquals("A", produit.getGrade());
        assertEquals("Confiserie", produit.getCategorie().getNom());
        assertEquals("Nestlé", produit.getMarque().getNom());
        assertEquals(0, produit.getIngredients().size());
        assertEquals(0, produit.getAdditifs().size());
        assertEquals(0, produit.getAllergenes().size());
    }
}
