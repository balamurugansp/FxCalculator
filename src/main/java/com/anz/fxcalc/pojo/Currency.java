/**
 * 
 */
package com.anz.fxcalc.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 

/**
 * @author balamurugan
 *
 */
public enum Currency {
	USD("USD"),
	AUD("AUD"),
	CAD("CAD"),
	CNY("CNY"),
	EUR("EUR"),
	GBP("GBP"),
	NZD("NZD"),
	JPY("JPY"),
	CZK("CZK"),
	DKK("DKK"),
	NOK("NOK");
	
	
	public final String symbol;
	

	private Currency(final String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}


	// Reverse-lookup map for getting a currency from a Symbol
	private static final Map<String, Currency> lookup = new HashMap<String, Currency>();
	private static List<String> currencyList = new ArrayList<String>(); 

	static {
		for (Currency c : Currency.values()) {
			lookup.put(c.toString(), c);
		}
		int t=0;
		int k;
		for (Currency c1:Currency.values()){			 
			for (Currency c2:Currency.values()){
				k=0;
				currencyList.add(c1.toString()+"_"+c2.toString());
				k++;
			}
			t++;
		}
	}

	public static Currency get(String symbol) {
		return lookup.get(symbol);
	}
	
	public static List<String> getList(){
		return currencyList;
	}
	
}
