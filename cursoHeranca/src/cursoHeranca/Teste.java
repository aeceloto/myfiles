package cursoHeranca;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double price = sc.nextDouble();
		System.out.println (String.format(".2f", price));
		
		sc.close();
	}

}
