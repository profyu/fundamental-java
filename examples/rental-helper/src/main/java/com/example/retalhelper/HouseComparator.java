package com.example.retalhelper;

import java.util.Comparator;

public class HouseComparator implements Comparator<House> {

	@Override
	public int compare(House o1, House o2) {
		
		float unitPrice1 = o1 == null ? 0 : o1.getPrice() / o1.getArea();
		float unitPrice2 = o2 == null ? 0 : o2.getPrice() / o2.getArea();
		
		if(unitPrice1 < unitPrice2){
			return -1;
		}
		else if(unitPrice1 > unitPrice2){
			return 1;
		}
		else{
			return 0;
		}
		
		
	}
	
}
