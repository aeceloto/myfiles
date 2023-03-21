package entities;

public class Company extends TaxPayer {

	private int numFunc;  
	
	
	public Company(String name, Double anualIncome,int numFunc) {
		super(name, anualIncome);
		this.numFunc = numFunc;
	}
	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}



	@Override
	public Double tax() {
		if (numFunc > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	
	}

}
