package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program3 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		 
		Employee employee = new Employee();
		System.out.println("Enter employee data: ");
		System.out.print("Name:" );
		
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary:");
		employee.grossSalary= sc.nextDouble();
		
		System.out.print("Tax:");
		employee.tax=sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee Data:" + employee);
		
		System.out.println();
		
		System.out.println("Enter the percentage to increase the employee salary:");
		
			double percentage = sc.nextDouble(); 
			employee.increaseSalary(percentage);
			
			System.out.println();
			System.out.println("Updated data:" + employee);
		
			
			
		sc.close();
		

	}

}
