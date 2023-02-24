package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Product_vect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product2[] vect = new Product2[n];
		for (int i = 0; i < vect.length ; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product2(name, price);
		}
		double sum = 0.00;	
		for (int i = 0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/n;
		
		System.out.printf("AVERGAGE PRICE: %.2f%n",avg);
		sc.close();
	}

}
