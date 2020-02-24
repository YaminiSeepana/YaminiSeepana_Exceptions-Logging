package com.epam.Interest;
import java.text.DecimalFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CompoundInterest {
	private static final Logger LOGGER=LogManager.getLogger(CompoundInterest.class);
	private static DecimalFormat df = new DecimalFormat("0.00");
	public CompoundInterest(double principle, double rateOfInterest, double time) {
		
		double amount=(principle*Math.pow(1+(rateOfInterest/100), time))-principle;
		LOGGER.info("compound interest is : "+df.format(amount));
	}

}
