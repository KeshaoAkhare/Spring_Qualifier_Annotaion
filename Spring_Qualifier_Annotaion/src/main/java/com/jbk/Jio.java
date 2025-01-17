package com.jbk;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim{

	@Override
	public String calling() {
		return "You are calling from Jio" ;
	}

}
