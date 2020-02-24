package com.epam.construction;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cost {
	private static final Logger LOGGER=LogManager.getLogger(Cost.class);
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	LOGGER.info("choose the quality of material:");
	LOGGER.info("1.Standard Material");
	LOGGER.info("2.Above Standard Material");
	LOGGER.info("3.High Standard Material");
	LOGGER.info("4.High Standard Material and Fully automated home");
	int choice=sc.nextInt();
	LOGGER.info("Enter the area of house:");
	Double area=sc.nextDouble();
	TotalCost total_area=new TotalCost(choice,area);
}
}
