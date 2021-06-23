
public class order {

	public String OrderID,Customer,PickedUpBy,DeliveryLocation,DeliveryToPerson,DeliveryType;
	public double Cost, weight,distance,priceper1Km;



	public order(String orderID, String customer, String pickedUpBy, String deliveryLocation, String deliveryToPerson,
			double cost, String deliveryType, double weight, double distance, double priceper1Km) {
		super();
		OrderID = orderID;
		Customer = customer;
		PickedUpBy = pickedUpBy;
		DeliveryLocation = deliveryLocation;
		DeliveryToPerson = deliveryToPerson;
		Cost = cost;
		DeliveryType = deliveryType;
		this.weight = weight;
		this.distance = distance;
		this.priceper1Km = priceper1Km;
	}


	public String getOrderID() {
		return OrderID;
	}


	public void setOrderID(String orderID) {
		OrderID = orderID;
	}


	public String getCustomer() {
		return Customer;
	}


	public void setCustomer(String customer) {
		Customer = customer;
	}


	public String getPickedUpBy() {
		return PickedUpBy;
	}


	public void setPickedUpBy(String pickedUpBy) {
		PickedUpBy = pickedUpBy;
	}


	public String getDeliveryLocation() {
		return DeliveryLocation;
	}


	public void setDeliveryLocation(String deliveryLocation) {
		DeliveryLocation = deliveryLocation;
	}


	public String getDeliveryToPerson() {
		return DeliveryToPerson;
	}


	public void setDeliveryToPerson(String deliveryToPerson) {
		DeliveryToPerson = deliveryToPerson;
	}


	public double getCost() {
		return Cost;
	}


	public void setCost(double cost) {
		Cost = cost;
	}


	public String getDeliveryType() {
		return DeliveryType;
	}


	public void setDeliveryType(String deliveryType) {
		DeliveryType = deliveryType;
	}
	
	


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}


	public double getPriceper1Km() {
		return priceper1Km;
	}


	public void setPriceper1Km(double priceper1Km) {
		this.priceper1Km = priceper1Km;
	}


	public String toString() {
		return "order [OrderID=" + OrderID + ", Customer=" + Customer + ", PickedUpBy=" + PickedUpBy
				+ ", DeliveryLocation=" + DeliveryLocation + ", DeliveryToPerson=" + DeliveryToPerson + ", Cost=" + Cost
				+ ", DeliveryType=" + DeliveryType + ", weight=" + weight + ", distance=" + distance + ", priceper1Km="
				+ priceper1Km + "]";
	}


	
	
	
	
	
}
