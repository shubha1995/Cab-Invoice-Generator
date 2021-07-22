package com.bridgelabz.CabInvoiceGenerator;

public class CabService {
	

    private static final int COST_PER_TIME = 1;
    private static final double MIN_COST_PER_KM = 10;
    private static final  double MIN_FARE = 5;

	public static double invoiceGenrator(double distance, int time) {

	double totalFare = distance  *MIN_COST_PER_KM + time * COST_PER_TIME;
	if (totalFare < MIN_FARE)
		return MIN_FARE;
		
		return totalFare;
	}

	public double invoiceGenrator(Rides[] rides) {
		double totalFare = 0;
		for (Rides ride : rides) {
			totalFare += this.invoiceGenrator(ride.distance, ride.time);
			
		}
		return totalFare;
		
	}

	

}
