package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Student;
public class Program4_Student {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		 
		Student student = new Student();
		System.out.println("Enter student data: ");
		System.out.print("Name:" );
		
		student.name = sc.nextLine();
		
		System.out.print("1st grade:");
		student.grade1= sc.nextDouble();
		
		System.out.print("2nd grade:");
		student.grade2=sc.nextDouble();
		
		System.out.print("3rd grade:");
		student.grade3=sc.nextDouble();
		
		System.out.println();
		
		if (student.finalGrade() < 60.0 ) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
			
		}
		else {
			System.out.printf("PASS" + " " + "%.2f",student.finalGrade());
		}
			
			
		sc.close();

	}

}
