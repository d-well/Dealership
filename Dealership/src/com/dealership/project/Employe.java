package com.dealership.project;

import java.util.ArrayList;
import java.util.List;

public class Employe {
	
	private int empId;
	private String empName;
	private String vehicleType;
	private List<String> vehicles;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	
}
