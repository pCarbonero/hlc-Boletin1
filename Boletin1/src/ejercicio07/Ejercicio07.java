package ejercicio07;

import java.time.Year;

public class Ejercicio07 {
	public static boolean fecha(int dia, int mes, int anyo) {
		boolean esCorrecto = false;
		
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12: {
			if (dia > 0 && dia <= 31 && anyo > 0) {
				esCorrecto = true;
			}
			break;
		}
		
		case 4, 6, 9, 11: {
			if (dia > 0 && dia <= 30 && anyo > 0) {
				esCorrecto = true;
			}
			break;
		}
		
		case 2: {
			if (!Year.of(anyo).isLeap() && dia > 0 && dia <= 28 && anyo > 0) {
				esCorrecto = true;
			}
			else if (Year.of(anyo).isLeap() && dia > 0 && dia <= 28 && anyo > 0) {
				esCorrecto = true;
			}
			break;
		}
		default:
			System.out.println("aad");
		}
		
		return esCorrecto;
	}
}
