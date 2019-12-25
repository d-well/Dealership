package com.Dcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TestMain {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
		{
			 System.out.println("Please Enter Your Name");
			 String custName = br.readLine();
			 System.out.println("Hello.. "+custName+" \nPlease enter your budget");
			 double budget = Double.valueOf(br.readLine());
			 boolean exitFlag = false;
			  if(budget <= 100000) {
				 while(budget<=100000){
					 System.out.println("Sorry ! We don't have cars below 1 lakh.");
					 System.out.println("Please re-enter your budget or type 1 to exit.");
					 budget = Double.valueOf(br.readLine());
					 if(budget == 1) {
						 System.out.println("Thankyou for choosing \"DCoder\" Car Enquiry System.");
						 exitFlag=true;
						 br.close();
						 break;
					 }
				 }
				}
			 if(!exitFlag) {
				 List carBrands = new ArrayList();
					Car car = new Car();
					carBrands = car.getBrands(budget);
					if(!carBrands.isEmpty() && carBrands!= null) {
						System.out.println("Here are the List of Car Companies under "+budget);
						for(int i=0; i<carBrands.size();i++) {
							System.out.print(carBrands.get(i));
							if(i==(carBrands.size()-2)) {
								System.out.print(" and ");
							}else if(i==(carBrands.size()-1)){
								System.out.print(".\n");
							}else {
								System.out.print(", ");
							}
						}
						
						System.out.println("Which brand would you like to see ?");
						String brandName = br.readLine(); 
						Map<String, Double> carList = new HashMap<String, Double>();
						carList = car.getCarList(brandName, budget);
						int count=1;
						for(Map.Entry m : carList.entrySet()){
							System.out.print(count+") ");
							if(brandName.equalsIgnoreCase("Toyota")) {
								System.out.print("Toyota ");
							}
							if(brandName.equalsIgnoreCase("Ford")) {
								System.out.print("Ford ");
							}
							if(brandName.equalsIgnoreCase("Tata Motors") || brandName.contains("Tata") || brandName.equalsIgnoreCase("Tata")
									|| brandName.contains("Motors") || brandName.equalsIgnoreCase("Motors")) {
								System.out.print("Tata ");
							}
							if(brandName.equalsIgnoreCase("Jeep")) {
								System.out.print("Jeep ");
							}
							System.out.println(m.getKey()+" Rs. "+m.getValue()+" lakh onwards....\n");
							count++;
						}
					}else {
						System.out.println("Sorry We don't have Cars under "+budget);
					} 
			 }
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
