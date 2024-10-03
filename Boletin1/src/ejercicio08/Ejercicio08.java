package ejercicio08;

public class Ejercicio08 {
	public static int fibonacci(int num) {

		int a = 1;
		int b = 1;
		int res = 1;
		
		if (num == 1 || num == 2) {
			res = 1;
		}
		else {
			for (int i = 3; i <= num; i++) {
				res = a + b;
				b = a;
				a = res;
			}
		}


		return res;
	}
}



