package com.travelplanner.service;


import java.time.Instant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelplanner.dao.ITravelPlanner;
import com.travelplanner.entity.TravelForm;

@Service
public class TravelPlannerService {

	@Autowired
	ITravelPlanner travelplanner;
	
	
	
	public void addData(TravelForm travelform) {
		travelform.setBookingTime_Date(travelform.getBookingTime_Date().from(Instant.now()));
		travelplanner.save(travelform);
	}
	
	public List<TravelForm> getTravellersList(){
		return travelplanner.getTravellersData();
		
		
	}
}
