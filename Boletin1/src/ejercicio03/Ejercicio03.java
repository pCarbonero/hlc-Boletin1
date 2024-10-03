package ejercicio03;

public class Ejercicio03 {
	public static String cadenita (int num) {
		String cad = "";
		if (num%3 == 0) {
			cad += "fizz";
		}
		if (num%5 == 0) {
			cad += "buzz"; 
		}
		return cad;
	}
}
