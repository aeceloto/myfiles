package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		List<Employee> list  = new ArrayList<>();
		
		for(int i=0; i<n;i++) {
			System.out.println ("Employee #" + (i+1) + ":");
			System.out.print ("id:");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary =sc.nextDouble();
			Employee emp = new Employee (id,name,salary);
			list.add(emp);
			
			}
		System.out.println();
		System.out.print("Enter the Employee id that the salary will be increased:");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		sc.close();
		
		}

	private static boolean hasId(List<Employee> list, Integer id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null; 
	}
		
		
		
			
			
			
	
			
		
		

		
		
		
		
		

	}


