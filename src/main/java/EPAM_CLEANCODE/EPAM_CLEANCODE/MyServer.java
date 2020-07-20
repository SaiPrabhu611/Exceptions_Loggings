package EPAM_CLEANCODE.EPAM_CLEANCODE;
import java.io.*;
import java.math.BigDecimal;
import java.net.*; 
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class MyServer {  
	final Logger LOGGER=LogManager.getLogger(MyServer.class); 
public static void main(String[] args){  
try{  
	int choice;
ServerSocket ss=new ServerSocket(8888);  
Socket s=ss.accept();//establishes connection 
Scanner sc=new Scanner(s.getInputStream());  
choice=sc.nextInt();
PrintStream p=new PrintStream(s.getOutputStream());
switch(choice)
{
case 1:SimpleInterest SimpleInterestObject=new SimpleInterest();
       BigDecimal SimpleInterestResult=SimpleInterestObject.SimpleInterestResult();
       p.println(SimpleInterestResult);
       break;
case 2: CompoundInterest CompoundInterestObject=new CompoundInterest();
	    BigDecimal CompoundInterestResult=CompoundInterestObject.CompoundInterestResult();
        p.println(CompoundInterestResult);
        break;
case 3:BuildingCostEstimation BuildingCostObject=new BuildingCostEstimation();
       BigDecimal BuildingCost=BuildingCostObject.BuildingCost();  
       p.println(BuildingCost);
       break;
default:BigDecimal Err=new BigDecimal(Integer.MIN_VALUE);
	    p.println(Err);    

}

ss.close();
}catch(Exception e){System.out.println(e);}  
}  
}