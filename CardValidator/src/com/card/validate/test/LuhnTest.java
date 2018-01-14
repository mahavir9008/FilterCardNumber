package com.card.validate.test;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LuhnTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testZero(){
		Assert.assertTrue(Luhn.Check("0"));
	}
	
	@Test
	public void testOne(){
		Assert.assertFalse(Luhn.Check("1"));
	}
	
	/**
	 * test value and compare the result with online Lunr check for invalid number
	 */
	@Test
	public void testvalue(){
		Assert.assertFalse(Luhn.Check("7992739871"));
		Assert.assertFalse(Luhn.Check("79927398710"));
	    Assert.assertFalse(Luhn.Check("79927398714"));
		Assert.assertFalse(Luhn.Check("79927398716"));
	}
	
	/**
	 * test value and compare the result with online Lunr check for invalid number
	 */
	@Test
	public void testClientData(){
		Assert.assertTrue(Luhn.Check("4929804463622139"));
		Assert.assertTrue(Luhn.Check("6762765696545485"));
	    Assert.assertTrue(Luhn.Check("6210948000000029"));
	}
}
