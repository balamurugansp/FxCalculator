/**
 * 
 */
package com.anz.fxcalc.api;

 

import com.anz.fxcalc.exception.CurrencyNotSupportedException;



/**
 * @author balamurugan
 *
 */
public interface Converter {

	public Double convertCurrency(String moneyAmount, String fromCurrency, String toCurrency) throws CurrencyNotSupportedException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException ;
}
