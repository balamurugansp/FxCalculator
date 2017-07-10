/**
 * 
 */
package com.anz.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.anz.fxcalc.api.Converter;
import com.anz.fxcalc.api.CurrencyConverter;
import com.anz.fxcalc.exception.CurrencyNotSupportedException;

/**
 * @author balamurugan
 *
 */
public class CurrencyConverterTest    {
	private Converter convert = null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		convert =  new CurrencyConverter();
		
	}

	@Test
	public void AUDUSDTest() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, CurrencyNotSupportedException {
		 double value=convert.convertCurrency("100.00", "AUD", "USD");
		 Assert.assertTrue("Expected a value",value==83.71);
	}
	@Test
	public void AUDAUDTest() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, CurrencyNotSupportedException {
		 double value=convert.convertCurrency("100.00", "AUD", "AUD");
		 Assert.assertTrue("Expected a value",value==100.00);
	}
	@Test
	public void JPYUSDTest() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, CurrencyNotSupportedException {
		 double value=convert.convertCurrency("100.00", "JPY", "USD");
		 Assert.assertTrue("Expected a value",value==0.83);
	}
	
	@Test
	public void AUDJPYTest() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, CurrencyNotSupportedException {
		 double value=convert.convertCurrency("1.00", "AUD", "JPY");
		 Assert.assertTrue("Expected a value",value==100.41);
	}



}
