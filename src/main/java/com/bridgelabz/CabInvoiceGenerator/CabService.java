package com.bridgelabz.CabInvoiceGenerator;

public class CabService {

	public static double invoiceGenrator(double distance, int time) {

		double totalFare = 0.0;
		if (distance < 1 && time <= 10) {
			totalFare = 5.00;
		} else {
			totalFare = distance * 10 + time;

		}
		

		return totalFare;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to CAB INVOICE GENERATOR");

	}

}
