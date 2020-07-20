package EPAM_CLEANCODE.EPAM_CLEANCODE;

import java.math.BigDecimal;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BuildingCostEstimation {


	private static  Logger LOGGER=LogManager.getLogger(BuildingCostEstimation.class); 

	static Scanner sc1=new Scanner(System.in);
	private BigDecimal costPerSquareFeet;
	 private BigDecimal houseArea, totalBuildingCost;
	int choice;
	public BuildingCostEstimation()
	{
		LOGGER.info("Enter the area of house in Squarefeets");
	   this.houseArea=sc1.nextBigDecimal();
	   LOGGER.info("Choose the material for constructing house");
	   LOGGER.info("1.Standard Material\n2.Above Standard Material\n 3.High Standard Material \n4.High Standard With Fully Automated home");
         this.choice=sc1.nextInt();
        
	}
	
	
	public  BigDecimal BuildingCost() {
	switch(choice)
	{
	case 1: costPerSquareFeet=new BigDecimal(1200);
	        this.totalBuildingCost=costPerSquareFeet.multiply(houseArea);
	        break;
	case 2:this.costPerSquareFeet=new BigDecimal(1500);
    this.totalBuildingCost=costPerSquareFeet.multiply(houseArea);
    break;
	case 3:this.costPerSquareFeet=new BigDecimal(1800);
    this.totalBuildingCost=costPerSquareFeet.multiply(houseArea);
    break;
	case 4:this.costPerSquareFeet=new BigDecimal(2500);
    this.totalBuildingCost=costPerSquareFeet.multiply(houseArea);
    break;
    default: BigDecimal Err=new BigDecimal(Integer.MIN_VALUE);
    LOGGER.error("Invalid Choice");
    this.totalBuildingCost= Err;
	
	}
	return totalBuildingCost;
	}

}
