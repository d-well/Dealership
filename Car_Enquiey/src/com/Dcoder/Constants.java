package com.Dcoder;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	Map<String, String> toyotaCars;
	Map<String, String> fordCars;
	Map<String, String> tataCars;
	Map<String, String> jeepCars;
	
	public void loadCars() {
		toyotaCars = new HashMap<String, String>(){{
			put("Fortuner", "27.83");
			put("Innova", "14.93");
			put("Glanza", "6.98");
			put("Platinum Etios", "6.50");
			put("Corolla Altis", "16.45");
			put("Etios", "7.04");
			}};
		fordCars = new HashMap<String, String>(){{
			put("EcoSport", "7.91");
			put("Endeavour", "29.20");
			put("Figo", "5.23");
			put("Mustang", "74.62");
			put("Aspire", "5.99");
			put("Freestyle", "5.91");
			}};
		tataCars = new HashMap<String, String>()
		{{
			put("Nexon", "6.58");
			put("Harrier", "13.00");
			put("Tiago", "4.40");
			put("Tigor EV", "9.17");
			put("Safari Storme", "11.09");
			put("Hexa", "13.26");
			put("Tigor", "5.50");
			}};
		jeepCars = new HashMap<String, String>()
		{{
			put("Compass", "14.99");
			put("Wrangler", "63.94");
			put("Grand Cherokee", "78.83");
			put("Compass Trailhawk", "26.80");
			}};
		
	}
}
