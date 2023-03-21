package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct(){
		super();
	}
	
	public ImportedProduct(String name, double price, Double customsFee) {
		super(name, price);
		this.setCustomsFee(customsFee);
	}
   
	@Override
	public String priceTag() {
		return getName() + " $ " + String.format("%.2f",getPrice()) 
		+ "(Customs fee: $ " 
		+ String.format("%.2f", customsFee) 
		+ ")";
		
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
}
