package com.card.validate;

/**
 * Container for validation result
 *  CardValidator.validate(CardNo) - validate the criteria of card number
 *  CardTypeExtractor.extract(CardNo); - match the category of card
 */
 class CardValidationResult {
	public CardValidationResult(String cardno) throws Exception {
		super();
		this.cardno = cardno;
		this.isValid = CardValidator.validate(cardno) ? Constant.CARD_NUMBER_VALID : Constant.CARD_NUMBER_INVALID;
		this.brand = CardTypeExtractor.extract(cardno);
	}

	private String cardno;
	private String brand;
	private String isValid;

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "[cardno =" + cardno + ", brand =" + brand + ", isValid ="
				+ isValid + "]";
	}
}