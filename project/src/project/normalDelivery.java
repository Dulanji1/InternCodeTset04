package project;

public class normalDelivery extends DeliveryPackages {

	
	public float cost() {
		return (float) (weight * super.distance * 100.00);
	}
	
}
