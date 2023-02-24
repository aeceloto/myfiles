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
public class Exercicio4 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int soma = a + b;
		System.out.println("A soma dos números digitados é: " +soma);
		
		sc.close();

}
}
