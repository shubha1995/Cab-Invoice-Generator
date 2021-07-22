package com.bridgelabz.CabInvoiceGenerator;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class CabServiceTest {

	CabService cabService;

	@Before

	@Test

	public void InvoiceGenratorShowIdReturnTotalFare() {
		CabService cabService = new CabService();
		double distance = 0.4;
		int time = 1;
		double totalFare = cabService.invoiceGenrator(distance, time);
		assertEquals(5, totalFare, 0.0);

	}
	

}