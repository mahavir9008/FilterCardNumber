# FilterCardNumber
The native java libary CardValidator.jar which provide method to perform the filtering of credit card number. Here is the API which will show result.

### FactoryCardFilter.getCardType("4929804463622139")

**Clause apply to validate a credit card number** -

-It contains only numbers and no leading 0. 
-it is 12-19 digits long.
-It passes the Luhn check ( https://en.wikipedia.org/wiki/Luhn_algorithm ).


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
