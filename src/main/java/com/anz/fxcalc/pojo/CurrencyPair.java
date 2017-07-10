/**
 * 
 */
package com.anz.fxcalc.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author balamurugan
 *
 */
public class CurrencyPair {
	 private  Map<String,String> currencyTable= new HashMap<String,String>();;
	 
	 
	public CurrencyPair(){}
	 

	/**
	 * @return the currencyTable
	 */
	public   Map<String, String> getCurrencyTable() {
		int size= Currency.getList().size();
		List<String> currValues= Currency.getList();
		String []value= null;
		for(int i=0;i<size;i++)
			 {
				value= currValues.get(i).split("_");
				
				if (value[0].equals(value[1])){
					currencyTable.put(currValues.get(i),"1:1");
				}
				else if(value[0].equals(Currency.AUD.toString())){
					
					if(value[1].equals(Currency.USD.toString())){
						currencyTable.put(currValues.get(i),"D");
					}
					else if (value[1].equals(Currency.CAD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CNY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CZK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.DKK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.EUR.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.GBP.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.JPY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NOK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NZD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
 
				}
				else if(value[0].equals(Currency.CAD.toString())){
					if(value[1].equals(Currency.USD.toString())){
						currencyTable.put(currValues.get(i),"D");
					}
					else if (value[1].equals(Currency.AUD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CNY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CZK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.DKK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.EUR.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.GBP.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.JPY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NOK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NZD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}

				}
				else if(value[0].equals(Currency.CNY.toString())){
					if(value[1].equals(Currency.USD.toString())){
						currencyTable.put(currValues.get(i),"D");
					}
					else if (value[1].equals(Currency.AUD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CAD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CZK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.DKK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.EUR.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.GBP.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.JPY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NOK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NZD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
				}
				
				else if(value[0].equals(Currency.CZK.toString())){
					if(value[1].equals(Currency.USD.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.DKK.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.EUR.toString())){
						currencyTable.put(currValues.get(i),"INV");
					}
					else if (value[1].equals(Currency.NOK.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.AUD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CAD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CNY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}					 
					else if (value[1].equals(Currency.GBP.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.JPY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
				 
					else if (value[1].equals(Currency.NZD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
				}
				
				
				else if(value[0].equals(Currency.DKK.toString())){
					if(value[1].equals(Currency.USD.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.CZK.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.EUR.toString())){
						currencyTable.put(currValues.get(i),"INV");
					}
					else if (value[1].equals(Currency.NOK.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.CNY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}					 
					else if (value[1].equals(Currency.GBP.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.JPY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NZD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.AUD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CAD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
				}
				
				
				else if(value[0].equals(Currency.EUR.toString())){
					if(value[1].equals(Currency.USD.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.CZK.toString())){
						currencyTable.put(currValues.get(i),"D");
					}
					else if (value[1].equals(Currency.DKK.toString())){
						currencyTable.put(currValues.get(i),"D");
					}
					else if (value[1].equals(Currency.NOK.toString())){
						currencyTable.put(currValues.get(i),"D");
					}
					else if (value[1].equals(Currency.AUD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CAD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CNY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}	
					else if (value[1].equals(Currency.GBP.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.JPY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}	
					else if (value[1].equals(Currency.NZD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
				}
				
				else if(value[0].equals(Currency.GBP.toString())){
					if(value[1].equals(Currency.USD.toString())){
						currencyTable.put(currValues.get(i),"D");
					}
					else if (value[1].equals(Currency.AUD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CAD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CNY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}	
					else if (value[1].equals(Currency.DKK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.JPY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}	
					else if (value[1].equals(Currency.NZD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CZK.toString())){
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.EUR.toString())){
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NOK.toString())){
						currencyTable.put(currValues.get(i),"USD");
					}
				}
				
				else if(value[0].equals(Currency.JPY.toString())){
					if(value[1].equals(Currency.USD.toString())){
						currencyTable.put(currValues.get(i),"INV");
					}
					else if (value[1].equals(Currency.AUD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CAD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CNY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}	
					else if (value[1].equals(Currency.DKK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.GBP.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}	
					else if (value[1].equals(Currency.NZD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CZK.toString())){
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.EUR.toString())){
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NOK.toString())){
						currencyTable.put(currValues.get(i),"USD");
					}
					
				}
				else if(value[0].equals(Currency.NOK.toString())){
					if(value[1].equals(Currency.USD.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.CZK.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.DKK.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.EUR.toString())){
						currencyTable.put(currValues.get(i),"INV");
					}
					else if (value[1].equals(Currency.AUD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CAD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CNY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}	
					else if (value[1].equals(Currency.GBP.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}	
					else if (value[1].equals(Currency.JPY.toString())){
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NZD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					 
				}
				else if(value[0].equals(Currency.NZD.toString())){
					if(value[1].equals(Currency.USD.toString())){
						currencyTable.put(currValues.get(i),"D");
					} 
					else if (value[1].equals(Currency.AUD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CAD.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.CNY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}	
					else if (value[1].equals(Currency.CZK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}	
					else if (value[1].equals(Currency.DKK.toString())){
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.EUR.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.GBP.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.JPY.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					else if (value[1].equals(Currency.NOK.toString())){						
						currencyTable.put(currValues.get(i),"USD");
					}
					
				}
				else if(value[0].equals(Currency.USD.toString())){
					if (value[1].equals(Currency.CZK.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.DKK.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					
					else if (value[1].equals(Currency.NOK.toString())){
						currencyTable.put(currValues.get(i),"EUR");
					}
					else if (value[1].equals(Currency.JPY.toString())){
						currencyTable.put(currValues.get(i),"D");
					}
					else if (value[1].equals(Currency.AUD.toString())){						
						currencyTable.put(currValues.get(i),"INV");
					}
					else if (value[1].equals(Currency.CAD.toString())){						
						currencyTable.put(currValues.get(i),"INV");
					}
					else if (value[1].equals(Currency.CNY.toString())){						
						currencyTable.put(currValues.get(i),"INV");
					}	
					else if (value[1].equals(Currency.GBP.toString())){						
						currencyTable.put(currValues.get(i),"INV");
					}	
					else if (value[1].equals(Currency.EUR.toString())){						
						currencyTable.put(currValues.get(i),"INV");
					}	
					else if (value[1].equals(Currency.NZD.toString())){						
						currencyTable.put(currValues.get(i),"INV");
					}	
					 
				}
				
			}
		
		
		return currencyTable;
	}
	 
	 
	 
	 
	 
}
