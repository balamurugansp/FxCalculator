/**
 * 
 */
package com.anz.fxcalc.service;

import com.anz.fxcalc.exception.CurrencyNotSupportedException;
import com.anz.fxcalc.pojo.Currency;
 

/**
 * @author balamurugan
 *
 */
public interface ServiceEndPoint {
	public static final Currency baseCurrency=Currency.USD;
	
	/**
	 * helper method to convert to base currency e.g:USD
	 * Scenario : {other currency --> covert USD}
	 *
	 * @param moneyAmount money amount to convert
	 * @param fromCurrency currency to convert from
	 * @param
	 * @param
	 * @return double converted amount	 
	 * @throws CurrencyNotSupportedException
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public Double convertToBaseCurrency(Double moneyAmount, Currency fromCurrency, boolean isStart,String currvalue) throws   CurrencyNotSupportedException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException;

	/**
	 * helper method to convert to base currency e.g:USD
	 * Scenario : {covert USD --> other currency}
	 *
	 * @param moneyAmount money amount to convert
	 * @param toCurrency currency to USD into
	 * @param
	 * @param
	 * @return double converted amount
 	 * @throws CurrencyNotSupportedException
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public Double convertFromBaseCurrency(Double moneyAmount, Currency toCurrency,boolean isStart,String currVal) throws CurrencyNotSupportedException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException;

	/**
	 * retrieves rate of exchange price for the desired currency
	 *
	 * @param currency
	 * @param
	 * @param
	 * @return Double exchange rate
	 * @throws CurrencyNotSupportedException
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public abstract Double getRate(Currency currency, boolean isStart,String currVal)  throws CurrencyNotSupportedException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException;
}
 
