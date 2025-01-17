package com.jbk;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim{

	@Override
	public String calling() {
		return "You are calling from Airtel";
	}

}
