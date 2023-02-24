package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public Product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity=quantity; 
	}


	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProduct(int quantity) {

		this.quantity += quantity;
		// "this" referencia que estamos utilizando a propria variavel da classe e não o
		// parâmetro da classe

	}

	public void removeProduct(int quantity) {

		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $" + String.format("%.2f", price) + "," + quantity + " " + "units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}
}
