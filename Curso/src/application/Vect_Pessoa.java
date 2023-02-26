package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Vect_Pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		double sumAltura = 0.00;
		for(int i=0; i <pessoa.length;i++) {
		System.out.print("Digite o nome:");
		System.out.println();
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("Digite a idade:");
		System.out.println();
		int idade = sc.nextInt();
		System.out.print("Digite a altura:");
		double altura =sc.nextDouble();
		pessoa[i] = new Pessoa(name, idade, altura);
		sumAltura += pessoa[i].getAltura();
		}
		
		double alturaMedia = sumAltura / n;
		
		int nmenores = 0;
		
		for (int i =0; i<pessoa.length ; i++) {
			if (pessoa[i].getIdade() < 16) {
				nmenores++;
				System.out.println(pessoa[i]);
			}
		}
		double percentualMenores = ((double)nmenores * 100)/n;
		
		System.out.printf("\nAltura Media = %.2f%n", alturaMedia);
		System.out.printf("Percentual de Menores = %.0f%n", percentualMenores);
		
		
		
		sc.close();
	}

}
