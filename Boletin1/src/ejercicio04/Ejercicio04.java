package ejercicio04;


public class Ejercicio04 {
	public static boolean numeroPrimo(int num) {
		boolean esPrimo = true;
		int i = 2;
		
		while (i <= Math.sqrt(num) && esPrimo == true) {
			if (num%i == 0) {
				esPrimo = false;
			}
			i++;
		}
		return esPrimo;
	}
}
