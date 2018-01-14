# FilterCardNumber
The native java libary CardValidator.jar which provide method to perform the filtering of credit card number. Here is the API which will show result.

### FactoryCardFilter.getCardType("4929804463622139")

**API Result**

*[cardno =4929804463622139, brand =VISA, isValid =Valid]*

**Clause apply to validate a credit card number** -

- It contains only numbers and no leading 0. 
- it is 12-19 digits long.
- It passes the Luhn check ( https://en.wikipedia.org/wiki/Luhn_algorithm ).


**The card number belong to a brand if the first 6 digits of the number fall in the following ranges**:
- Visa 
	400000 - 499999 
-  Mastercard 
        222100 - 272099 
        510000 - 559999 
- Maestro 
       500000 - 509999 
       60000 - 699999 
-  China Union Pay 
       620000 - 629999 (takes priority over Maestro) 
       
**Note** : For any exception, Application have to catch the exception such as -
 - if user enter incorrect lengh of card number then, Application have to catch a exception which send by libary and dispaly according to application requirement like -
- API Request -: try 
		     System.out.println(FactoryCardFilter.getCardType("49298044"));// length is less then 12 charcter
		 catch (Exception e) 
		       System.out.println(e.getMessage());
		
- API Response -:e.getMessage() ="Card length should be greater then 11"
