package EPAM_CLEANCODE.EPAM_CLEANCODE;

import java.io.IOException;


import java.util.*;
import java.io.*;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static  Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args ) throws UnknownHostException, IOException
    {
    	
    	LOGGER.info("This is a Info ");
    	int choice;
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	@SuppressWarnings("resource")
		Socket s= new Socket( "localhost",8888 );
    	@SuppressWarnings("resource")
		Scanner sc1=new Scanner(s.getInputStream());
    	PrintStream p=new PrintStream(s.getOutputStream());
    	
    	LOGGER.info("Enter any choice");
    	LOGGER.info("1.SimpleInterest\n2.CompoundInterest\n3.HouseCostEstimation");
    		
    	
    	choice=sc.nextInt();
    	p.println(choice);
    	
    
    	
    	 
    	BigDecimal Result=sc1.nextBigDecimal();
    	if(Result.equals(new BigDecimal(Integer.MIN_VALUE)))
    	{
    		LOGGER.error("Invalid Choice");
    	}
    	else
    		
    	{
    		
    		
    	 	System.out.println(Result);
    	}
    	
    }
}
