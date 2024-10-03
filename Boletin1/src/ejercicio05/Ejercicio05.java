package ejercicio05;

public class Ejercicio05 {
	public static boolean numeroCapicua (int num) {
		boolean esCapicua = false;
		int aux = num;
		int inv = 0;
		
		while (aux >= 1) {
			inv = inv*10 + (aux%10);
			aux /= 10;
		}
		
		if (num == inv) {
			esCapicua = true;
		}
		
		return esCapicua;
	}
}
