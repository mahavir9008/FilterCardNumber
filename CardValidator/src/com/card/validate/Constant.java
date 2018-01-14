package com.card.validate;

public class Constant {
	public static final String CARD_VISA = "VISA";
	// VISA RANGE = 400000​ ​-​ ​499999
	public static final String VISA_CARD_RANGE = "(4[0-8][0-9]{4}|49[0-8][0-9]{3}|499[0-8][0-9]{2}|4999[0-8][0-9]|49999[0-9])";

	public static final String CARD_MASTER = "MASTERCARD";
	// MASTER CARD RANGE = 510000​ ​-​ ​559999, 400000​ ​-​ ​499999
	public static final String MASTER_CARD_RANGE = "(222[1-8][0-9]{2}|2229[0-8][0-9]|22299[0-9]|22[3-9][0-9]{3}|2[3-6][0-9]{4}|27[01][0-9]{3}|2720[0-8][0-9]|27209[0-9]|(5[1-4][0-9]{4}|55[0-8][0-9]{3}|559[0-8][0-9]{2}|5599[0-8][0-9]|55999[0-9]))";

	public static final String CARD_CHINA_UNION_PAY = "CHINA_UNION_PAY";
	// CHINA_UNION_PAY RANGE = 620000​ ​-​ ​629999​ ​
	public static final String CHINA_UNION_PAY_RANGE = "(62[0-8][0-9]{3}|629[0-8][0-9]{2}|6299[0-8][0-9]|62999[0-9])";

	public static final String CARD_MAESTRO = "MAESTRO";
	// MAESTRO RANGE ="500000​ ​-​ ​509999",560000​ ​-​ ​699999
	public static final String MAESTRO_RANGE = "(50[0-8][0-9]{3}|509[0-8][0-9]{2}|5099[0-8][0-9]|50999[0-9])|(5[6-8][0-9]{4}|59[0-8][0-9]{3}|599[0-8][0-9]{2}|5999[0-8][0-9]|59999[0-9]|6[0-9]{5})";

	public static final String CARD_LENGTH_ERROR = "Card length should be greater then 11";
	public static final String INVALID_CARD = "NA";
	public static final String CARD_NUMBER_VALID = "Valid";
	public static final String CARD_NUMBER_INVALID = "InValid";
	 // check first charter not be zero,it should only be number, length of number must be between 12-19
	public static final String CARD_NUMBER_VALIDATE_REGEX = "^[1-9][0-9]*{12,19}$";

}
