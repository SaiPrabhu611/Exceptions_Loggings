package EPAM_CLEANCODE.EPAM_CLEANCODE;

import java.math.BigDecimal;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
public class CompoundInterest {
	static Scanner sc1=new Scanner(System.in);
	 BigDecimal principleAmount;
	  BigDecimal interestRate;
	  int timePeriod;
	
	public CompoundInterest()
	{	final Logger LOGGER=LogManager.getLogger(CompoundInterest.class); 
	LOGGER.info("*****************CompoundIntrest Calculator******************");
	LOGGER.info("Enter Principle amount");
       this.principleAmount=sc1.nextBigDecimal();
       LOGGER.info("Enter Rate of Intrest");
        this.interestRate=sc1.nextBigDecimal();
        LOGGER.info("Enter Total Time Period");
        this.timePeriod=sc1.nextInt();
        
	}
	public  BigDecimal CompoundInterestResult()
	{
		
		BigDecimal compoundInterest=principleAmount.multiply(BigDecimal.ONE.add(interestRate.divide(new BigDecimal(100))).pow(timePeriod)) ; 
		return compoundInterest;
		
	}

}
