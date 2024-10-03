package ejercicio06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ejercicio06Test {

	@Test
	void testCalculadora1() {
		double res = Ejercicio06.calculadora(3, 2, 1);
		assertEquals(5, res);
	}
	
	@Test
	void testCalculadora2() {
		double res = Ejercicio06.calculadora(3, 2, 2);
		assertEquals(1, res);
	}
	
	@Test
	void testCalculadora3() {
		double res = Ejercicio06.calculadora(3, 2, 3);
		assertEquals(6, res);
	}
	
	@Test
	void testCalculadora4() {
		double res = Ejercicio06.calculadora(3, 2, 4);
		assertEquals(1.5, res);
	}

	@Test
	void testCalculadora5() {
		
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () ->
			Ejercicio06.calculadora(3, 0, 4));
		Assertions.assertEquals("No se puede ", thrown.getMessage());// sin terminar 
		
	}
}
