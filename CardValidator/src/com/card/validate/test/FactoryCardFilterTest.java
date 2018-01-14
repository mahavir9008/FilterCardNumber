package com.card.validate.test;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

import com.card.validate.FactoryCardFilter;

public class FactoryCardFilterTest {
	
	/**
	 * check the length below 12 charter
	 */
	@Test
	public void testLengthCharterter(){
		try {
			System.out
					.println(FactoryCardFilter.getCardType("4556677"));
		} catch (Exception e) {
			Assert.assertEquals("Card length should be greater then 11", e.getMessage());;
		}
		
	}
	/**
	 * test range of visa 400000​ ​-​ ​499999
	 */
	@Test
	public void testWithinVisaRange(){
		Assert.assertTrue(Pattern.matches(Constant.VISA_CARD_RANGE, "400000"));
		Assert.assertTrue(Pattern.matches(Constant.VISA_CARD_RANGE, "499999"));
		Assert.assertTrue(Pattern.matches(Constant.VISA_CARD_RANGE, "450000"));
		
	}
		
	/**
	 * test range of visa 400000​ ​-​ ​499999
	 */
	@Test
	public void testOutOfVisaRange(){
		Assert.assertFalse(Pattern.matches(Constant.VISA_CARD_RANGE, "500000"));
		Assert.assertFalse(Pattern.matches(Constant.VISA_CARD_RANGE, "699999"));
		Assert.assertFalse(Pattern.matches(Constant.VISA_CARD_RANGE, "30000"));
	}
	
	/**
	 * test range of masterCard 222100​ ​-​ ​272099,510000​ ​-​ ​559999
	 */
	@Test
	public void testWithinMasterRange(){
		Assert.assertTrue(Pattern.matches(Constant.MASTER_CARD_RANGE, "222100"));
		Assert.assertTrue(Pattern.matches(Constant.MASTER_CARD_RANGE, "272099"));	
	}
		
	/**
	 * test range of masterCard 222100​ ​-​ ​272099,510000​ ​-​ ​559999
	 */
	@Test
	public void testOutOfMasterRange(){
		Assert.assertFalse(Pattern.matches(Constant.MASTER_CARD_RANGE, "10000876"));
		Assert.assertFalse(Pattern.matches(Constant.MASTER_CARD_RANGE, "2000975"));
		Assert.assertFalse(Pattern.matches(Constant.MASTER_CARD_RANGE, "8000098"));
	}
	
	/**
	 * test range of Maestro 500000​ ​-​ ​509999,560000​ ​-​ ​699999
	 */
	@Test
	public void testWithinMaestroRange(){
		Assert.assertTrue(Pattern.matches(Constant.MAESTRO_RANGE, "500000"));
		Assert.assertTrue(Pattern.matches(Constant.MAESTRO_RANGE, "560000"));	
	}
		
	/**
	 * test range of masterCard 222100​ ​-​ ​272099,510000​ ​-​ ​559999
	 */
	@Test
	public void testOutOfMaestroRange(){
		Assert.assertFalse(Pattern.matches(Constant.MAESTRO_RANGE, "90000876"));
		Assert.assertFalse(Pattern.matches(Constant.MAESTRO_RANGE, "7000975"));
		Assert.assertFalse(Pattern.matches(Constant.MAESTRO_RANGE, "8000098"));
	}
	
	/**
	 * test range of China​ ​Union​ ​Pay 620000​ ​-​ ​629999​
	 */
	@Test
	public void testWithinUnionPayRange(){
		Assert.assertTrue(Pattern.matches(Constant.MAESTRO_RANGE, "620000"));
		Assert.assertTrue(Pattern.matches(Constant.MAESTRO_RANGE, "629999"));	
	}
		
	/**
	 * test range of China​ ​Union​ ​Pay 620000​ ​-​ ​629999​
	 */
	@Test
	public void testOutOfUnionpayRange(){
		Assert.assertFalse(Pattern.matches(Constant.MAESTRO_RANGE, "90000876"));
		Assert.assertFalse(Pattern.matches(Constant.MAESTRO_RANGE, "7000975"));
		Assert.assertFalse(Pattern.matches(Constant.MAESTRO_RANGE, "8000098"));
	}
}
