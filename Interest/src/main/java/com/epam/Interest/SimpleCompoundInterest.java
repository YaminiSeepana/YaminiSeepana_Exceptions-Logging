package com.epam.Interest;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SimpleCompoundInterest {
	private static final Logger LOGGER=LogManager.getLogger(SimpleCompoundInterest.class);
	public static void calculator() {
		double principle,time;
		double rateOfInterest;
		Scanner sc=new Scanner(System.in);
		LOGGER.info("enter the principle amount:");
		principle=sc.nextDouble();
		LOGGER.info("enter the rate of interest:");
		rateOfInterest=sc.nextDouble();
		LOGGER.info("enter the time duration:");
		time=sc.nextDouble();
		SimpleInterest si=new SimpleInterest(principle,rateOfInterest,time);
		CompoundInterest ci=new CompoundInterest(principle,rateOfInterest,time);
	}
}
