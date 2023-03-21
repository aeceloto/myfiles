package entities;

public class Individual extends TaxPayer {

	private Double healthExp;
	
	public Individual(String name,Double anualIncome,Double healthExp) {
		super(name,anualIncome);
		this.healthExp = healthExp;
		
	}
	
	public Double getHealthExp() {
		return healthExp;
	}

	public void setHealthExp(Double healthExp) {
		this.healthExp = healthExp;
	}

	@Override
	public Double tax() {
		if (getAnualIncome() > 20000.00) {
			return getAnualIncome() * 0.25 - healthExp * 0.5;
			
		}
		else {
			return getAnualIncome() * 0.15 - healthExp * 0.5;
		}
		
	}

}
