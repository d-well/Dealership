package com.Dcoder;

import java.util.*;

public class Car {
	
	Constants constants = new Constants();
	
	public Car() {
		constants.loadCars();
	}
	
	public List getBrands(double budget) {
		List brands = new ArrayList();
		//Map<String, Double> map = constants.toyotaCars;
		for(Map.Entry m1 : constants.toyotaCars.entrySet()) {
			if(budget > (Double.valueOf(((String)m1.getValue())))) {
				brands.add("Toyota");
				break;
			}
		}
		for(Map.Entry m1 : constants.fordCars.entrySet()) {
			if(budget > (Double.valueOf(((String)m1.getValue())))) {
				brands.add("Ford");
				break;
			}
		}
		for(Map.Entry m1 : constants.tataCars.entrySet()) {
			if(budget > (Double.valueOf(((String)m1.getValue())))) {
				brands.add("Tata Motors");
				break;
			}
		}
		for(Map.Entry m1 : constants.jeepCars.entrySet()) {
			if(budget > (Double.valueOf(((String)m1.getValue())))) {
				brands.add("Jeep");
				break;
			}
		}
		return brands;
	}
	
	public Map getCarList(String brandName, double budget) {
		Map<String, String> carList = new HashMap<String, String>();
		if (brandName.equalsIgnoreCase("Toyota")) {
			for(Map.Entry m1 : constants.toyotaCars.entrySet()) {
				if(budget > (Double.valueOf((String)m1.getValue()))) {
					carList.put((String)m1.getKey(),(String)m1.getValue());
				}
			}
		}
		if (brandName.equalsIgnoreCase("Ford")) {
			for(Map.Entry m1 : constants.fordCars.entrySet()) {
				if(budget > (Double.valueOf((String)m1.getValue()))) {
					carList.put((String)m1.getKey(),(String)m1.getValue());
				}
			}
		}
		if (brandName.equalsIgnoreCase("Tata Motors") || brandName.contains("Tata") || brandName.equalsIgnoreCase("Tata")
				|| brandName.contains("Motors") || brandName.equalsIgnoreCase("Motors")) {
			for(Map.Entry m1 : constants.tataCars.entrySet()) {
				if(budget > (Double.valueOf((String)m1.getValue()))) {
					carList.put((String)m1.getKey(),(String)m1.getValue());
				}
			}			
		}
		if (brandName.equalsIgnoreCase("Jeep")) {
			for(Map.Entry m1 : constants.jeepCars.entrySet()) {
				if(budget > (Double.valueOf((String)m1.getValue()))) {
					carList.put((String)m1.getKey(),(String)m1.getValue());
				}
			}
		}
		return carList;
	}
}
