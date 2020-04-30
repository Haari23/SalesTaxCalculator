package com.sales.tax.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sales.tax.OrderBill;
import com.sales.tax.TaxCalculatorApplication;

public class TaxCalculatorApplicationTest {

	private TaxCalculatorApplication taxCalculatorApplication;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {


	}

	@Before
	public void setUp() throws Exception {
		taxCalculatorApplication = new TaxCalculatorApplication();
	}

	//positive test cases
	@Test
	public  void testByPositiveFirstInputValues() {
		String[]  inputData = new String []{"1 book at 12.49","1 music CD at 14.99","1 chocolate bar at 0.85 "};
		OrderBill generateReceipt = taxCalculatorApplication.generateReceipt(inputData);
		assertEquals("Checking total sale tax from actual to expected values are same : ","Sales Taxes :1.5", generateReceipt.getTotalSalesTax());
		assertEquals("Checking total amounts from actual to expected values are same: "," Total :29.83",generateReceipt.getTotalAmount() );

	}

	//nagative test cases
	@Test
	public  void testByNagativeFirstInputValues() {
		String[]  inputData = new String []{"1 book at 10.49","1 music CD at 13.99","1 chocolate bar at 1.85 "};
		OrderBill generateReceipt = taxCalculatorApplication.generateReceipt(inputData);
		assertNotEquals("Checking total sale tax from actual to expected values are not same: ","Sales Taxes :1.5", generateReceipt.getTotalSalesTax());
		assertNotEquals("Checking total amounts from actual to expected values are not same : "," Total :29.83",generateReceipt.getTotalAmount() );

	}

	//exception test cases
	@Test(expected=Exception.class)
	public  void testByExceptionFirstInputValues() {
		String[]  inputData = new String []{""};
		OrderBill generateReceipt = taxCalculatorApplication.generateReceipt(inputData);
		assertNotEquals("Checking total sale tax from actual to expected values are rised exception : ","Sales Taxes :1.5", generateReceipt.getTotalSalesTax());
		assertNotEquals("Checking total amounts from actual to expected values are rised exception : "," Total :29.83",generateReceipt.getTotalAmount() );

	}



	//positive test cases
	@Test
	public  void testByPositiveSecondInputValues() {
		String[]  inputData = new String []{"1 imported box of chocolates at 10.00","1 imported bottle of perfume at 47.50"};
		OrderBill generateReceipt = taxCalculatorApplication.generateReceipt(inputData);
		assertEquals("Checking total sale tax from actual to expected values are same: ","Sales Taxes :7.65", generateReceipt.getTotalSalesTax());
		assertEquals("Checking total amounts from actual to expected values are same: "," Total :65.15",generateReceipt.getTotalAmount() );

	}

	//nagative test cases
	@Test
	public  void testByNagativeSecondInputValues() {
		String[]  inputData = new String []{"1 imported box of chocolates at 10.00","1 imported bottle of perfume at 47.50"};
		OrderBill generateReceipt = taxCalculatorApplication.generateReceipt(inputData);
		assertNotEquals("Checking total sale tax from actual to expected values are not same: ","Sales Taxes: 7.65", generateReceipt.getTotalSalesTax());
		assertNotEquals("Checking total amounts from actual to expected values are notsame: "," Total: 65.15",generateReceipt.getTotalAmount());

	}

	//exception test cases
	@Test(expected=Exception.class)
	public  void testByExceptionSecondInputValues() {
		String[]  inputData = new String []{""};
		OrderBill generateReceipt = taxCalculatorApplication.generateReceipt(inputData);
		assertNotEquals("Checking total sale tax from actual to expected values are rised exception : ","Sales Taxes: 7.65", generateReceipt.getTotalSalesTax());
		assertNotEquals("Checking total amounts from actual to expected values are rised exception: "," Total: 65.15",generateReceipt.getTotalAmount() );

	}


	//positive test cases
	@Test
	public  void testByPositiveThirdInputValues() {
		String[]  inputData = new String []{"1 imported bottle of perfume at 27.99","1 bottle of perfume at 18.99","1 packet of headache pills at 9.75","1 box of imported chocolates at 11.25"};
		OrderBill generateReceipt = taxCalculatorApplication.generateReceipt(inputData);
		assertEquals("Checking total sale tax from actual to expected values are same : ","Sales Taxes :6.7", generateReceipt.getTotalSalesTax());
		assertEquals("Checking total amounts from actual to expected values are same: "," Total :74.68",generateReceipt.getTotalAmount() );

	}

	//nagative test cases
	@Test
	public  void testByNagativeThirdInputValues() {
		String[]  inputData = new String []{"1 imported bottle of perfume at 25.99","1 bottle of perfume at 10.99","1 packet of headache pills at 9.75","1 box of imported chocolates at 11.25"};
		OrderBill generateReceipt = taxCalculatorApplication.generateReceipt(inputData);
		assertNotEquals("Checking total sale tax from actual to expected values are not same : ","Sales Taxes: 6.70", generateReceipt.getTotalSalesTax());
		assertNotEquals("Checking total amounts from actual to expected values are not same: "," Total: 74.68",generateReceipt.getTotalAmount());

	}

	//exception test cases
	@Test(expected=Exception.class)
	public  void testByExceptionThirdInputValues() {
		String[]  inputData = new String []{""};
		OrderBill generateReceipt = taxCalculatorApplication.generateReceipt(inputData);
		assertNotEquals("Checking total sale tax from actual to expected values : ","Sales Taxes: 6.70", generateReceipt.getTotalSalesTax());
		assertNotEquals("Checking total amounts from actual to expected values : "," Total: 74.68",generateReceipt.getTotalAmount() );

	}

	@After
	public void tearDown() throws Exception {
		if(taxCalculatorApplication != null) {
			taxCalculatorApplication=null;
		}

	}
}
