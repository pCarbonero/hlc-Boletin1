package ejercicio09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio09Test {

	@Test
	void testBinario() {
		String res = Ejercicio09.binario(0);
		assertEquals("0", res);
	}
	
	@Test
	void testBinario2() {
		String res = Ejercicio09.binario(1);
		assertEquals("1", res);
	}
	
	@Test
	void testBinario3() {
		String res = Ejercicio09.binario(2);
		assertEquals("10", res);
	}

}
