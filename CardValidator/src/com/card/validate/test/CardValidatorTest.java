package com.card.validate.test;

import org.junit.Assert;
import org.junit.Test;

public class CardValidatorTest {
	
	/**
	 * test card client data
	 */
	@Test
	public void testCardData(){
		Assert.assertTrue(CardValidator.validate("4929804463622139"));
		Assert.assertTrue(CardValidator.validate("6762765696545485")); 
	}
	
	/**
	 * test card data preceed with zero
	 */
	@Test
	public void testCardDataPrecedWithZero(){
		Assert.assertFalse(CardValidator.validate("07992739871"));
		Assert.assertFalse(CardValidator.validate("079927398710"));
	    Assert.assertFalse(CardValidator.validate("079927398714"));
		Assert.assertFalse(CardValidator.validate("079927398716"));
	}

}
