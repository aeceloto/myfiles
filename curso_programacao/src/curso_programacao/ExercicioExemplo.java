package curso_programacao;
import java.util.Locale;
import java.util.Scanner; 
public class ExercicioExemplo{

	public static void main(String[] args) {
		double largura;
		double comprimento;
		double area;
		double precoMetro;
		double precoFinal;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da largura:");
		largura = sc.nextDouble();
		System.out.println("Digite o valor do comprimento:");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do Preço do Metro Quadrado:");
		precoMetro=sc.nextDouble();
		area = largura * comprimento;
		precoFinal = area * precoMetro;
		System.out.printf("Area = %.2f\n",area);
		System.out.printf("Preço = %.2f\n",precoFinal);
		
		sc.close();

}
}
