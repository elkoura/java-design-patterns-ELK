package fr.diginamic.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElementFactoryTest {

	@Test
	public void testCreateElement() {
		Element ingerdiant= ElementFactory.createElement(ElementType.INGREDIENT, "sucre", 100, Unite.GRAMMES);
		assertTrue(ingerdiant instanceof Ingredient);
        assertEquals("Sucre", ingerdiant.getNom());
        assertEquals(100, ingerdiant.getValeur(), 0.000001);
        assertEquals(Unite.GRAMMES, ingerdiant.getUnite());
	}

}
