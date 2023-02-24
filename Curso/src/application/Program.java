package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle X:");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX =x.area();
		double areaY = y.area();
		
		
		System.out.printf("Area of triangle x: %.4f%n", areaX);
		System.out.printf("Area of triangle y: %.4f%n", areaY);
		
		if ( areaX > areaY) {
			System.out.println("Large Area: X");
		}
		else {
			System.out.printf("Large Area: Y");
		}
		sc.close();
		
	}
}
	


