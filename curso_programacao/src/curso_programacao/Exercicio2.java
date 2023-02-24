/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
package curso_programacao;
import java.util.Scanner;
import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
		int numfunc;
		int horas;
		double valorHora;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do Funcionário:");
		numfunc = sc.nextInt();
		System.out.println("Digite a quantidade de Horas Trabalhadas:");
		horas = sc.nextInt();
		System.out.println("Digite o valor Hora:");
		valorHora = sc.nextDouble();
		double total = (horas * valorHora);
		System.out.printf("Número do Funcionário: %d e salário U$ = %.2f ",numfunc,total);
		 
		sc.close();

}
}
	