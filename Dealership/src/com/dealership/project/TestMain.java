package com.dealership.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Customer Name");
			String custName = br.readLine();
			System.out.println("Enter Vehicle Type");
			String vType = br.readLine();
			System.out.println("Enter Budget");
			double budget=Double.valueOf(br.readLine());
			System.out.println("Enter Addres Zone");
			String zone=br.readLine();
			Customer c1 = new Customer(custName, vType, budget, zone);
			Dealer d=null;
			String specificVehicle;
			List<String> vehicleList = new ArrayList<String>();
			int count=0;
			boolean abc=false;
			
			/*if(vType.equalsIgnoreCase("Car")){
				System.out.println("Which type of Car do you want ?");
				specificVehicle=br.readLine();
			}else if(vType.equalsIgnoreCase("Car")){
				System.out.println("We have many types of Bikes.\nWhich type of Bike do you want ?");
				specificVehicle=br.readLine();
			}*/
			//while(abc == false) {
				
				if(c1.getAddressZone().equalsIgnoreCase("North")){
					d = new Dealer("Bhau Bike Dealer", 101, "North");
				}
				else if(c1.getAddressZone().equalsIgnoreCase("West")){
					d = new Dealer("Tommy Car Dealer", 102, "West");
				}
				else if(c1.getAddressZone().equalsIgnoreCase("South")){
					d = new Dealer("Mah Mah Cat Dealer", 103, "South");
				}
				else if(c1.getAddressZone().equalsIgnoreCase("East")){
					d = new Dealer("Premium Bike And Car Dealer", 104, "East");
				}
				
				abc=d.checkDealerAndVehicle(vType);
				if(abc==false) {
					System.out.println(d.getDealerName()+" do not sell "+c1.getDesiredVehicleType());
					System.out.println("Enter '1' for Other Zone or '2' for Dealer who sell "+c1.getDesiredVehicleType());
					int opt = Integer.parseInt(br.readLine());
					if(opt==1) {
						List<String> list=new ArrayList<String>();
						list=d.getZoneList(c1.getAddressZone());
						System.out.println(list.toString());
					}else if(opt==2) {
						List list = d.getDealerByVehicleType(c1.getDesiredVehicleType());
						System.out.println(list.toString());
					}else {
						System.out.println("Please Type Correct Key..");
					}
				}
			//}
			
			
			System.out.println("Hello "+c1.getCustName()+" ! we '"+d.getDealerName()+"' pleased to show you our Vehicle Collections.\n");
			vehicleList=d.vehicleList();
			System.out.print("We have ");
			for(int i=0; i<vehicleList.size();i++){
				if(i!=vehicleList.size()-1){
					System.out.print("'"+vehicleList.get(i)+"'");
					count++;
				}
				if(count != vehicleList.size()-1){
					System.out.print(", ");
				}else {
					System.out.print(" And ");
					System.out.print("'"+vehicleList.get(i+1)+"'.");
					break;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
