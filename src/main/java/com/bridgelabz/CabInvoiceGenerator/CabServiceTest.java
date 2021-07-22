package com.bridgelabz.CabInvoiceGenerator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class CabServiceTest {

	CabService cabService = null;

	@Before
	public void setUp() throws Exception {
		CabService cabService = new CabService();
	}

	@Test

	public void InvoiceGenratorShowIdReturnMainFare() {
		double distance = 0.4;
		int time = 1;
		double totalFare = cabService.invoiceGenrator(distance, time);
		assertEquals(5, totalFare, 0.0);

	}


	@Test
	public void InvoiceGenratorShowIdReturnInvoiceSummary() {
		Rides[] rides = { new Rides(2.0, 5), 
							new Rides(0.1, 1), 
		
		};

		InvoiceSumary summary = cabService.invoiceGenrator(rides);
		InvoiceSumary expectedInvoiceSumary  = new InvoiceSumary(2, 30.0); 
		assertEquals(expectedInvoiceSumary, summary);

	}
}