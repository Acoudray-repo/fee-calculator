package com.flat.ws.fee_calculator.config;


import org.junit.jupiter.api.Test;


public class ConfigurationManagerTest {
	
	@Test
	public void insertDataTest () {
		
		
		ConfigurationManager configMan = ConfigurationManager.getInstance();
		
		
		configMan.loadConfiguration();
		
		
	}

}