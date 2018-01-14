package com.card.validate;

import java.util.regex.Pattern;

class CardTypeExtractor {
   /**
    * 
    * @param cardNo - card no in string 
    * @return - card type
    * @throws Exception - Application send the exception if length less then 12
    */
	public static String extract(String cardNo) throws Exception {
		if (cardNo.length() < 12)
			throw new Exception(Constant.CARD_LENGTH_ERROR);
		// extract the first six digit 
		String firstSixDigit = cardNo.substring(0, 6);
		if (Pattern.matches(CardCompany.VISA.getRegex(), firstSixDigit))
			return CardCompany.VISA.getIssuerName();
		if (Pattern.matches(CardCompany.MASTERCARD.getRegex(), firstSixDigit))
			return CardCompany.MASTERCARD.getIssuerName();
		if (Pattern.matches(CardCompany.CHINA_UNION_PAY.getRegex(),
				firstSixDigit))
			return CardCompany.CHINA_UNION_PAY.getIssuerName();
		if (Pattern.matches(CardCompany.MAESTRO.getRegex(), firstSixDigit))
			return CardCompany.MAESTRO.getIssuerName();

		return Constant.INVALID_CARD;
	}

}
