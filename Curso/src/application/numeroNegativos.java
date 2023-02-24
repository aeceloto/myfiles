package application;

import java.util.Locale;
import java.util.Scanner;

public class numeroNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você vai digitar");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0 ; i < vect.length ; i++) {
			System.out.print("Digite um número:");
			vect[i] = sc.nextInt();
		}
		System.out.println("Números Negativos:");
		
		for(int i = 0;i<vect.length;i++) {
			if(vect[i]<0) {
			System.out.printf("%d\n", vect[i]);
			}
		}
		
		
		sc.close();
	}

}
