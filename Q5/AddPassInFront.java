package com.Q5;

public class AddPassInFront {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Passenger p1 = new Passenger("Adnan", 24, "9607527337");
		Passenger p2 = new Passenger("Arbaaz", 23, "8390816370");
		Passenger p3 = new Passenger("Asif", 24, "9730833857");
		Passenger p4 = new Passenger("Umer", 24, "7218615887");
		
		BusQueue BestBus = new BusQueue();
		BestBus.Enqueue(p1);
		BestBus.Enqueue(p2);
		BestBus.Enqueue(p3);
		BestBus.show();
		BestBus.EnqueueAtFront(p4);
		System.out.println("==============================");
		BestBus.show();

	}

}
