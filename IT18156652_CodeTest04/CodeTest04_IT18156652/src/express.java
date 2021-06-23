
public class express implements orderType{

	public double weight, distance, priceper1Km;
	
		
	public express(double weight, double distance, double priceper1Km) {
		super();
		this.weight = weight;
		this.distance = distance;
		this.priceper1Km = priceper1Km;
	}



	public double calculate() {
		// TODO Auto-generated method stub
		return weight*distance*priceper1Km*1.5;
	}

}
