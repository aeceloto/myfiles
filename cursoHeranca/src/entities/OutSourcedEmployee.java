package entities;

public class OutSourcedEmployee extends Employee {

	Double additionalCharge;
	
	public OutSourcedEmployee() {
		super();
	}
	
	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
		// TODO Auto-generated constructor stub
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
    public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
