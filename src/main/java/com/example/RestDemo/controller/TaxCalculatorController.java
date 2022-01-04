package com.example.RestDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestDemo.services.TaxCalculator;

@RestController
@RequestMapping("/calculate")
public class TaxCalculatorController {
	
	@Autowired
	TaxCalculator taxCalculator;
	
	@GetMapping("/incometax/{income}")
	public double calculateIncomeTax(@PathVariable String income) {
		
		
		
		return taxCalculator.getIncomeTax(Long.parseLong(income));
		
	}

}
