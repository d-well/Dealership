package com.dealership.project;

import java.util.*;

public class Dealer {
	
	private String dealerName;
	private int dealerId;
	private List<String> vehicles;
	private String availableVehicle;
	private String vehiclePrice;
	private String paymentType;
	private String zone;
	private Map<Integer, String> dealerIdAndType = null;
	private Map<Integer, String> dealerNameAndId = null;
	
	public Dealer(String dealerName, int dealerId, String zone) {
		this.dealerName=dealerName;
		this.dealerId=dealerId;
		this.zone=zone;
		dealerType();
		setDealerNameIdMap();
	}

	@Override
	public String toString() {
		return "Dealer [dealerName=" + dealerName + ", dealerId=" + dealerId
				+ ", zone=" + zone + "]";
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public List<String> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}

	public String getAvailableVehicle() {
		return availableVehicle;
	}

	public void setAvailableVehicle(String availableVehicle) {
		this.availableVehicle = availableVehicle;
	}

	public String getVehiclePrice() {
		return vehiclePrice;
	}

	public void setVehiclePrice(String vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public List<String> vehicleList(){
		vehicles = new ArrayList<String>();
		
		vehicles.add("Normal Car");
		vehicles.add("Premium Car");
		vehicles.add("Heavy Car");
		vehicles.add("Normal Bike");
		vehicles.add("Premium Bike");
		vehicles.add("Sports Bike");
		
		return vehicles;
	}
	
	public boolean checkDealerAndVehicle(String vType) {
		 String type = (String) dealerIdAndType.get(dealerId);
		 if(type.contains(vType))
			 return true;
		 else return false;
	}
	
	private void dealerType() {
		dealerIdAndType=new HashMap<Integer, String>();
		dealerIdAndType.put(101,"Car");
		dealerIdAndType.put(102,"Bike");
		dealerIdAndType.put(103,"Heavy Car");
		dealerIdAndType.put(104,"Bike And Car");
		dealerIdAndType.put(105,"Sports Bike");
	}
	
	private void setDealerNameIdMap() {
		dealerNameAndId=new HashMap<Integer, String>();
		dealerNameAndId.put(101,"Bhau Bike Dealer");
		dealerNameAndId.put(102,"Tommy Car Dealer");
		dealerNameAndId.put(103,"Mah Mah Cat Dealer");
		dealerNameAndId.put(104,"Premium Bike And Car Dealer");
		dealerNameAndId.put(105,"No Assigned");
	}
	
	List<String> zoneList = new ArrayList<String>();

	public List<String> getZoneList(String oldZone) {
		zoneList.add("North");
		zoneList.add("East");
		zoneList.add("West");
		zoneList.add("South");
		zoneList.remove(oldZone);
		return zoneList;
	}
	
	public List getDealerByVehicleType(String vType) {
		List intList = new ArrayList();
		for (Map.Entry list : dealerIdAndType.entrySet()) {
			String value =(String)list.getValue();
			if(value.contains(vType)) {
				intList.add(getDealerById((int)list.getKey()));
			}
		}
		return intList;
	}
	
	private String getDealerById(int id) {
		String name;
		name=dealerIdAndType.get(id);
		return name;
	}
}
