package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program_Abstract {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of tax payers:");
	int n = sc.nextInt();
	List<TaxPayer> list = new ArrayList<>();
	
	for(int i = 1 ; i<=n ; i++	) {
	System.out.println("Tax Payer #" + i + " data ");
	System.out.print("Individual or company (i/c)? ");
	char type = sc.next().charAt(0);
	System.out.print("Name:");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.print("Anual income: ");
	double income = sc.nextDouble();
	if (type =='i') {
		System.out.print("Health Expedintures: ");
		double healthExp = sc.nextDouble();
		list.add(new Individual(name,income, healthExp));
	}
		else if (type == 'c') {
			System.out.print("Number of employees: ");
			int numFunc = sc.nextInt();
			list.add(new Company (name,income, numFunc));
		}
		
	}
	
	double sum = 0.0;
	System.out.println();
	System.out.println("TAXES PAID:");
	for (TaxPayer tp : list) {
		double tax = tp.tax();
		System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
		sum += tax;
	}
	
	System.out.println();
	System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
	sc.close();
	}

	

	}


