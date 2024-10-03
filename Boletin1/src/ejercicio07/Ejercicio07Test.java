package ejercicio07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio07Test {

	@Test
	void testFecha() {
		boolean res = Ejercicio07.fecha(1, 12, 2003);
		assertTrue(res);
	}
	
	@Test
	void testFecha2() {
		boolean res = Ejercicio07.fecha(1, 13, 2003);
		assertFalse(res);
	}
	
	@Test
	void testFecha3() {
		boolean res = Ejercicio07.fecha(31, 4, 2003);
		assertFalse(res);
	}
	
	@Test
	void testFecha4() {
		boolean res = Ejercicio07.fecha(29, 2, 2024);
		assertTrue(res);
	}

}
