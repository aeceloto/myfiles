package entities;

public class Employee {
	
	private int id;
	private String name; 
	private double grossSalary;
	private double tax;
	
	public Employee (int id, String name, double grossSalary) {
		this.id = id; 
		this.name = name; 
		this.grossSalary = grossSalary; 
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getGrossSalary() {
		return grossSalary;
	}


	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}


	public double netSalary() {
		return grossSalary - tax; 
	}
	
	public void increaseSalary(double percentage) {
		grossSalary +=  grossSalary * percentage / 100; 
	}
	
	public String toString() {
		return name 
			+ ", $ "
			+String.format("%.2f", netSalary() );
		
	}
}
