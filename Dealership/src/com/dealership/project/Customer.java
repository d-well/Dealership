package com.dealership.project;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String custName;
	private String addressZone;
	private String desiredVehicleType;
	private double budget;
	Dealer dealer;
	
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddressZone() {
		return addressZone;
	}

	public void setAddressZone(String addressZone) {
		this.addressZone = addressZone;
	}

	public String getDesiredVehicleType() {
		return desiredVehicleType;
	}

	public void setDesiredVehicleType(String desiredVehicleType) {
		this.desiredVehicleType = desiredVehicleType;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public Customer(String custName, String desiredVehicleType, double budget, String addressZone) {
		this.custName = custName;
		this.desiredVehicleType = desiredVehicleType;
		this.budget = budget;
		this.addressZone=addressZone;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", addressZone="
				+ addressZone + ", desiredVehicleType=" + desiredVehicleType
				+ ", budget=" + budget + "]";
	}
	
		
}
