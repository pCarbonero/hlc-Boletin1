package ejercicio06;

public class Ejercicio06 {
	public static double calculadora(double a, double b, int opc) {
		double  res = 0;
		
		switch (opc) {
		case 1: {
			res = a + b;
			break;
		}
		case 2: {
			res = a - b;
			break;
		}
		case 3: {
			res = a * b;
			break;
		}
		case 4: {
			res = a / b;
			break;
		}
		default:
			System.out.println("Número no válido");
		}

		 return res;
	}
}// class
