package com.lti.component;

import org.springframework.stereotype.Component;

@Component("cc")
public class CurrencyConverter {

	public double covertDollarsToRupees(double dollars) {
		return dollars*68.44;
	}
}
