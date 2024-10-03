package ejercicio05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio05Test {

	@Test
	void testNumeroCapicua() {
		boolean res = Ejercicio05.numeroCapicua(1);
		assertTrue(res);
	}
	
	@Test
	void testNumeroCapicua2() {
		boolean res = Ejercicio05.numeroCapicua(2);
		assertTrue(res);
	}
	
	@Test
	void testNumeroCapicua10() {
		boolean res = Ejercicio05.numeroCapicua(10);
		assertFalse(res);
	}
	
	@Test
	void testNumeroCapicua11() {
		boolean res = Ejercicio05.numeroCapicua(11);
		assertTrue(res);
	}
	
	@Test
	void testNumeroCapicua22() {
		boolean res = Ejercicio05.numeroCapicua(22);
		assertTrue(res);
	}
	
	@Test
	void testNumeroCapicua25() {
		boolean res = Ejercicio05.numeroCapicua(25);
		assertFalse(res);
	}
	
	@Test
	void testNumeroCapicua101() {
		boolean res = Ejercicio05.numeroCapicua(101);
		assertTrue(res);
	}
	
	@Test
	void testNumeroCapicua1001() {
		boolean res = Ejercicio05.numeroCapicua(1001);
		assertTrue(res);
	}
	
	@Test
	void testNumeroCapicua2222() {
		boolean res = Ejercicio05.numeroCapicua(2222);
		assertTrue(res);
	}
	
	@Test
	void testNumeroCapicua2232() {
		boolean res = Ejercicio05.numeroCapicua(2232);
		assertFalse(res);
	}


}
