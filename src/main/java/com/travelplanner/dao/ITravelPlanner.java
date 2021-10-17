package com.travelplanner.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.travelplanner.entity.TravelForm;

public interface ITravelPlanner extends JpaRepository<TravelForm, Integer>{

	@Query(value = "select * from travel_form tf order by tf.booking_time_date desc",nativeQuery = true)
	List<TravelForm> getTravellersData();
}
