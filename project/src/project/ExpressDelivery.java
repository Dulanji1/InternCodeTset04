package project;

public class ExpressDelivery extends DeliveryPackages {

	String date,time;
	
	
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public float cost() {
		return (float) (weight * super.distance * 100.00 * 1.5);
	}
}
