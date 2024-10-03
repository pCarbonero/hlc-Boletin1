package ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio04Test {

	@Test
	void testNumeroPrimo1() {
		boolean res = Ejercicio04.numeroPrimo(1);
		assertTrue(res);
	}

	@Test
	void testNumeroPrimo2() {
		boolean res = Ejercicio04.numeroPrimo(2);
		assertTrue(res);
	}
	
	@Test
	void testNumeroPrimo4() {
		boolean res = Ejercicio04.numeroPrimo(4);
		assertFalse(res);
	}
	
	@Test
	void testNumeroPrimo6() {
		boolean res = Ejercicio04.numeroPrimo(6);
		assertFalse(res);
	}
	
	@Test
	void testNumeroPrimo11() {
		boolean res = Ejercicio04.numeroPrimo(11);
		assertTrue(res);
	}
	
	@Test
	void testNumeroPrimo15() {
		boolean res = Ejercicio04.numeroPrimo(15);
		assertFalse(res);
	}
}
