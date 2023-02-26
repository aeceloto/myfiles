package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Quartos;
public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		
		Quartos[] vect = new Quartos[10];
		
		for (int i = 1; i <=n ; i++) {
			System.out.println();
			System.out.println("Rent #:" + i + ":");
			System.out.println ("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("E-mail:");
			String email = sc.next();
			System.out.println("Room:");
			int roomNumber = sc.nextInt();
			vect[roomNumber] = new Quartos(name, email);
			
			
		}
		System.out.println(); 
		System.out.println("Busy rooms:");
		for ( int i = 0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println (i + ":"+ vect[i]);
				}
			sc.close();
		}
		}
		
}
