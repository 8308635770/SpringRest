package com.example.RestDemo.services;

import org.springframework.stereotype.Service;

@Service
public class TaxCalculatorImpl implements TaxCalculator {

	@Override
	public double getIncomeTax(long income) {
		// TODO Auto-generated method stub
		
	   	int[] taxrange= {150000,500000,9200000};
    	float[] rate= {2.5f,10f,25f,30f};
    	
		double tax=0;

		
    	if(income<400000) {
    		System.out.println("Zero Tax");
    	}else {
    		
    		float taxableIncome=income-150000;
    		boolean calTax=true;
    		for(int i=0;i<taxrange.length;i++) {
    			if(taxableIncome>taxrange[i]) {
    				taxableIncome=taxableIncome-taxrange[i];
    				tax=tax+taxrange[i]*rate[i]/100;
    				System.out.println("tax1: "+tax);
    			}else {
    				tax=tax+taxableIncome*rate[i]/100;
    				taxableIncome=taxableIncome-taxrange[i];
    				System.out.println("tax2: "+tax);
    				break;
    			}
    		}
    		
    		if(taxableIncome>0) {
    			tax=tax+taxableIncome*rate[rate.length-1]/100;
    			
    		}
    		
    		System.out.println(tax);
    		
    	}
		
		return tax;
	}

}
