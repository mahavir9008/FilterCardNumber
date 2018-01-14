package com.card.validate;

/**
 * enum for card company specifics and their ranges
 * 
 */
enum CardCompany {
	VISA(Constant.VISA_CARD_RANGE, Constant.CARD_VISA), 
	MASTERCARD(Constant.MASTER_CARD_RANGE, Constant.CARD_MASTER), 
	CHINA_UNION_PAY(Constant.CHINA_UNION_PAY_RANGE, Constant.CARD_CHINA_UNION_PAY), 
	MAESTRO(Constant.MAESTRO_RANGE, Constant.CARD_MAESTRO);

	private String regex;
	private String issuerName;

	CardCompany(String regex, String issuerName) {
		this.regex = regex;
		this.issuerName = issuerName;
	}

	public boolean matches(String card) {
		return card.matches(this.regex);
	}

	public String getIssuerName() {
		return this.issuerName;
	}

	public String getRegex() {
		return this.regex;
	}
}