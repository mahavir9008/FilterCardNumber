package com.card.validate;

/**
 * 
 * factory class to filter the card number
 *
 */
public class FactoryCardFilter {
	public static CardValidationResult getCardType(String cardNumber)
			throws Exception {
		return new CardValidationResult(cardNumber);
	}
}
