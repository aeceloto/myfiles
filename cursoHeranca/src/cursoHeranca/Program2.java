package cursoHeranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<Product>();
		System.out.print("Enter the numebers of products that will be added:");
		int n = sc.nextInt();
		
		for (int i = 1 ; i<=n ; i++) {
		System.out.println("Product# " + i + "  data:")	;
		System.out.print("Commomn, used or imported?(c/u/i)");
		char c = sc.next().charAt(0);
		sc.nextLine();
		System.out.print ("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price =sc.nextDouble();
		if (c == 'c') {
			list.add(new Product(name,price));
	    
		}
		else if (c=='u') {
			System.out.print("Data de fabricacao (DD/MM/YYYY): ");
			LocalDate manufacturedDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			list.add(new UsedProduct(name,price,manufacturedDate));
		}
		else {
			System.out.print("Customs Fee: ");
			Double customsFee = sc.nextDouble();
			list.add(new ImportedProduct(name,price,customsFee));

		}
		
		}	
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product pr : list) {
			System.out.println (pr.priceTag());
		}
		
		sc.close();
	}


}	