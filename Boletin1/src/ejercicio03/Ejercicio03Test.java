package ejercicio03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio03Test {

	@Test
	void testCadenita2() {
		String res = Ejercicio03.cadenita(2);
		assertEquals("", res);
	}
	
	@Test
	void testCadenita3() {
		String res = Ejercicio03.cadenita(3);
		assertEquals("fizz", res);
	}
	
	@Test
	void testCadenita4() {
		String res = Ejercicio03.cadenita(4);
		assertEquals("", res);
	}

	@Test
	void testCadenita5() {
		String res = Ejercicio03.cadenita(5);
		assertEquals("buzz", res);
	}
	
	@Test
	void testCadenita6() {
		String res = Ejercicio03.cadenita(6);
		assertEquals("fizz", res);
	}
	
	@Test
	void testCadenita9() {
		String res = Ejercicio03.cadenita(9);
		assertEquals("fizz", res);
	}
	
	@Test
	void testCadenita10() {
		String res = Ejercicio03.cadenita(10);
		assertEquals("buzz", res);
	}
	
	@Test
	void testCadenita15() {
		String res = Ejercicio03.cadenita(15);
		assertEquals("fizzbuzz", res);
	}
	
	@Test
	void testCadenita30() {
		String res = Ejercicio03.cadenita(30);
		assertEquals("fizzbuzz", res);
	}


}
