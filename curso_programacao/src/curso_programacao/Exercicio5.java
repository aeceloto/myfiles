/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Exemplos:
Entrada: Saída:
10
30
SOMA = 40
Entrada: Saída:
-30
10
SOMA = -20
Entrada: Saída:
0
0
SOMA = 0*/
package curso_programacao;
import java.util.Locale;
import java.util.Scanner; 
import java.math.*;
public class Exercicio5 {

	public static void main(String[] args) {
		int codPeca1;
		int qtdPeca1;
		double valorPeca1;
		int codPeca2;
		int qtdPeca2;
		double valorPeca2;
        double valorTotal;
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		codPeca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		valorPeca1=sc.nextDouble();
		codPeca2=sc.nextInt();
		qtdPeca2=sc.nextInt();
		valorPeca2=sc.nextDouble();
		valorTotal = (valorPeca1 * qtdPeca1) + (valorPeca2 * qtdPeca2);
		System.out.printf("VALOR A PAGAR:R$ %.2f\n  ",valorTotal);
		
		sc.close();

}
}
