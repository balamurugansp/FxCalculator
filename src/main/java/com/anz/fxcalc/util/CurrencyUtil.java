/**
 * 
 */
package com.anz.fxcalc.util;

/**
 * @author balamurugan
 *
 */

import com.anz.fxcalc.pojo.Currency;
public class CurrencyUtil {
 private static final String separator="_"; 
	public static Currency fromString(String text) {
	    for (Currency curr : Currency.values()) {
	      if (curr.symbol.equalsIgnoreCase(text)) {
	        return curr;
	      }
	    }
	    return null;
	}
	
	public static String convertFromCurrencyToString(Currency curr, String val,boolean isCheck){
		String currVal = null;
		if(isCheck){
			currVal=curr.toString()+separator+val;
		}
		else{
			currVal= val+separator+curr.toString();
		}
		return currVal;
			 
	}
	
}
