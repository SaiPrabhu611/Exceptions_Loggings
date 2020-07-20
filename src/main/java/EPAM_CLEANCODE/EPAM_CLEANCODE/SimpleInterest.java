package EPAM_CLEANCODE.EPAM_CLEANCODE;

import java.math.BigDecimal;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	static Scanner sc1=new Scanner(System.in);
	 BigDecimal principleAmount;
	  BigDecimal interestRate;
	  BigDecimal timePeriod;
	  final Logger LOGGER=LogManager.getLogger(SimpleInterest.class); 
	public SimpleInterest()
	{
		final Logger LOGGER=LogManager.getLogger(CompoundInterest.class); 
		LOGGER.info("******************SimpleIntrest Calculator*******************");
		LOGGER.info("Enter Principle amount");
       this.principleAmount=sc1.nextBigDecimal();
       LOGGER.info("Enter Rate of Intrest");
        this.interestRate=sc1.nextBigDecimal();
        LOGGER.info("Enter Time Period");
        this.timePeriod=sc1.nextBigDecimal();
	}
	
	public  BigDecimal SimpleInterestResult()
	{
		BigDecimal P=principleAmount;
		BigDecimal R=interestRate;
		BigDecimal T= timePeriod;
		BigDecimal simpleInterest=(P.multiply(T.multiply(R))).divide(new BigDecimal(100));
		return simpleInterest;
		
	}
	
	
	
}
