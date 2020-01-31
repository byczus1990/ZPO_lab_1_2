package main;

import java.math.BigInteger;

import javax.management.InvalidAttributeValueException;

public class SbBankNumberVeryficator 
{
	private String bankNumber;
	
	public SbBankNumberVeryficator(String bNr)
	{
		bankNumber = bNr;
	}

	public Boolean checkIfBankNumberIsCorrect() throws Exception
	{
		 if(bankNumber.isEmpty())
		 {			 
			 throw new InvalidAttributeValueException("Nie podales numeru bankowego");
		 }else if (bankNumber.length() != 26)
		 {
			 throw new InvalidAttributeValueException("Podales za krotki NRB");
		 }else if (bankNumber.length() == 26)
		 {
			 bankNumber +="2521";
			 bankNumber +=bankNumber.substring(0,2);
			 bankNumber = bankNumber.substring(2);
			 BigInteger nRB = new BigInteger(bankNumber);
			 BigInteger mNr = BigInteger.valueOf(97);
			 if (nRB.mod(mNr).intValue() == 1)
			 {
				 return true;
			 }else
			 {
				 return false;
			 }
		 }else 
		 {
			 return false;
		 }
	}


}
