package ejercicio01;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ejercicio1Test {

	@Test
	void testEsVocalA() {
		boolean resultado = Ejercicio1.esVocal('a');
		assertTrue(resultado);
	}

	@Test
	void testEsVocalE() {
		boolean resultado = Ejercicio1.esVocal('e');
		assertTrue(resultado);
	}

	@Test
	void testEsVocalI() {
		boolean resultado = Ejercicio1.esVocal('i');
		assertTrue(resultado);
	}

	@Test
	void testEsVocalO() {
		boolean resultado = Ejercicio1.esVocal('o');
		assertTrue(resultado);
	}

	@Test
	void testEsVocalU() {
		boolean resultado = Ejercicio1.esVocal('u');
		assertTrue(resultado);
	}
	
	@Test
	void testEsVocalP() {
		boolean resultado = Ejercicio1.esVocal('p');
		assertFalse(resultado);
	}

}
