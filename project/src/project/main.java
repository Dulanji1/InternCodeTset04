package project;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int OrderID;
		String Customer, PickedUpBy, DeliveryLocation, deliveryToPerson, deliveryType,date,time;
		float weight, distance;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer : ");
		Customer = sc.next();

		System.out.println("Enter Picked by : ");
		PickedUpBy = sc.next();

		System.out.println("Enter Delivery Location: ");
		DeliveryLocation = sc.next();

		System.out.println("Enter Reciver: ");
		deliveryToPerson = sc.next();

		System.out.println("Enter DeliveryType: ");
		deliveryType = sc.next();

		if (deliveryType == "Express" || deliveryType == "express") {
			System.out.println("Enter Date: ");
			date = sc.next();
			
			System.out.println("Enter Time: ");
			time = sc.next();
		}

			System.out.println("Enter weight: ");
		weight = sc.nextFloat();

		System.out.println("Enter distance: ");
		distance = sc.nextFloat();


	}

}
