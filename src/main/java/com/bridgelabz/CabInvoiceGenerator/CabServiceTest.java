package com.bridgelabz.CabInvoiceGenerator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;


public class CabServiceTest {

	CabService cabService;

	@Before

	@Test

	public void InvoiceGenratorShowIdReturnMainFare() {
		CabService cabService = new CabService();
		double distance = 0.4;
		int time = 1;
		double totalFare = cabService.invoiceGenrator(distance, time);
		assertEquals(5, totalFare, 0.0);

	}
	@Test
	public void InvoiceGenratorShowIdReturnTotalFare() {
		CabService cabService = new CabService();
		Rides [] rides = {new Rides(2.0, 5),
						  new Rides(0.1, 1),
						  };
		
		double fare = cabService.invoiceGenrator(rides);
		assertEquals(30, fare, 0.0);
		
	}
	

}