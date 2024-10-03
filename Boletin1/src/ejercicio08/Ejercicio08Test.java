package ejercicio08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio08Test {

	@Test
	void testFibonacci1() {
		int res = Ejercicio08.fibonacci(1);
		assertEquals(res, 1);
	}
	
	@Test
	void testFibonacci2() {
		int res = Ejercicio08.fibonacci(2);
		assertEquals(res, 1);
	}
	
	@Test
	void testFibonacci3() {
		int res = Ejercicio08.fibonacci(3);
		assertEquals(res, 2);
	}

}
