/**
 * 
 */
package com.anz.fxcalc.service;


import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.anz.fxcalc.constants.CurrencyValue;
import com.anz.fxcalc.exception.CurrencyNotSupportedException;
import com.anz.fxcalc.pojo.Currency;
import com.anz.fxcalc.util.CurrencyUtil;
/**
 * @author balamurugan
 *
 */
public class EndPointFactory implements ServiceEndPoint{
	static Logger log = Logger.getLogger(EndPointFactory.class.getName());
	
	private Map<Currency,Double > rate = null;
	public EndPointFactory(){
		rate = new HashMap<Currency,Double>();
	}
	
	public Double convertToBaseCurrency(Double moneyAmount, Currency fromCurrency,boolean isStart,String currValue)
			throws CurrencyNotSupportedException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		log.info("moneyAmount="+moneyAmount+".fromCurrency="+fromCurrency);
		Double rateValue=getRate(fromCurrency,isStart,currValue);
		log.info(rateValue +"\t MoneyAmount=" +moneyAmount );
		Double value=moneyAmount *  rateValue;
		log.info("value="+value);
		return (value);
	}

	public Double convertFromBaseCurrency(Double moneyAmount, Currency toCurrency,boolean isStart,String currValue)
			throws CurrencyNotSupportedException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		log.info("moneyAmount="+moneyAmount+".toCurrency="+toCurrency);
		
		Double sampleDigit=getRate(toCurrency, isStart,currValue)* moneyAmount;
		log.info("SampleDIGIT="+sampleDigit);
		return sampleDigit;
	}

	public Double getRate(Currency currency,boolean isStart,String currValue) throws CurrencyNotSupportedException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Double rateValue =null;
		if (!rate.isEmpty() && rate.containsKey(currency)) {
			rateValue= rate.get(currency);
			 
		}
		else if (currValue!=null&&currValue.equals("D")){  
			
			Double value= CurrencyValue.class.getDeclaredField(CurrencyUtil.convertFromCurrencyToString(currency, "USD", isStart)).getDouble(null);
			log.info("Fetching value from constant..."+value);
			rateValue = new Double(value);
			rate.put(currency, rateValue);
			 
		}
		else if (currValue!=null&&currValue.equals("INV")){
			Double value= CurrencyValue.class.getDeclaredField(CurrencyUtil.convertFromCurrencyToString(currency, "USD", false)).getDouble(null);
			log.info("Fetching value from constant..."+value);
			 value = 1/value;
			rateValue =  new Double(value);			 
			log.info("rateValue..."+rateValue);
			rate.put(currency, rateValue);
			 
		}
		else if (currValue!=null&&currValue.equals("EUR")){
			Double value= CurrencyValue.class.getDeclaredField(CurrencyUtil.convertFromCurrencyToString(currency, "EUR", false)).getDouble(null);
			log.info("Fetching value from constant..."+value);
			rateValue = value;
			rate.put(currency, rateValue);
			 
		}
		else if (currValue!=null&&currValue.equals("USD")){
			Double value= CurrencyValue.class.getDeclaredField(CurrencyUtil.convertFromCurrencyToString(currency, "USD",true)).getDouble(null);
			log.info("Fetching value from constant..."+value);
			rateValue = value;
			rate.put(currency, rateValue);
			 
		}
		 return rateValue;
		 
	}
	
	 	
	  

}
 