package com.card.validate.test;

import java.util.regex.Pattern;

class CardValidator {
	/**
	 * check-: Start number not be zero Number between 0 to 9 length of string
	 * between 12 to 19 satisfy Luhn validation
	 * 
	 * @param cardNo
	 *            - pass the card number
	 * @return true if all condition satisfy
	 */
	public static boolean validate(String cardNo) {
		String CARD_NUMBER_VALIDATE_REGEX = "^[1-9][0-9]*{12,19}$";
		if (!Pattern.matches(CARD_NUMBER_VALIDATE_REGEX, cardNo)) {
			return false;
		}
		if (!Luhn.Check(cardNo)) {
			return false;
		}
		return true;
	}

}
