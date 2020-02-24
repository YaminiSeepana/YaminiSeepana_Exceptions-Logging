package com.epam.construction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TotalCost {
	private static final Logger LOGGER=LogManager.getLogger(TotalCost.class);
	public TotalCost(int choice, Double area) {
		long  cost;
		switch(choice) {
		case 1:
			cost=(long) (1200*area);
			LOGGER.info("the total cost is:"+ cost);
			break;
		case 2:
			cost=(long) (1500*area);
			LOGGER.info("the total cost is:"+ cost);
			break;
		case 3:
			cost=(long) (1800*area);
			LOGGER.info("the total cost is:"+ cost);
			break;
		case 4:
			cost=(long) (2500*area);
			LOGGER.info("the total cost is:"+ cost);
			break;
		default:
			LOGGER.info("invalid choice");
			new Cost();
		}
		
	}

}
