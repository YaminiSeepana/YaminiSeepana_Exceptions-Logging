package com.epam.Interest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SimpleInterest {
	private static final Logger LOGGER=LogManager.getLogger(SimpleInterest.class);
public SimpleInterest(double principle, double rateOfInterest, double time) {
		double amount;
		amount=principle*rateOfInterest*time/100;
		LOGGER.info("simple interest is : "+amount);
	}
}
