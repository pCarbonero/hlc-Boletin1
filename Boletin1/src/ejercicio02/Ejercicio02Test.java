package ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio02Test {
	
	@Test
	void testNumeroPar1() {
		boolean res = Ejercicio02.numeroPar(1);
		assertFalse(res);
	}

	@Test
	void testNumeroPar2() {
		boolean res = Ejercicio02.numeroPar(2);
		assertTrue(res);
	}
	
	@Test
	void testNumeroPar4() {
		boolean res = Ejercicio02.numeroPar(4);
		assertTrue(res);
	}
	
	@Test
	void testNumeroPar5() {
		boolean res = Ejercicio02.numeroPar(5);
		assertFalse(res);
	}
	
	@Test
	void testNumeroPar6() {
		boolean res = Ejercicio02.numeroPar(6);
		assertTrue(res);
	}

}
