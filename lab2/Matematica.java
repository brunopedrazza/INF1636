package ex0303;

public class Matematica {
	public static double pi(int n) {
		double aprox;
		double term;
		
		aprox = 0;
		int i, j = 1;
		
		for (i = 0; i < n; i++, j += 2) {
			term  = 1;
			term /= j;
			if ((i % 2) == 0) {
				aprox += term;
			}
			else {
				aprox -= term;
			}
		}
		
		return 4*aprox;
	}
}
