package com.travelplanner.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.travelplanner.entity.TravelForm;

import com.travelplanner.service.TravelPlannerService;

@Controller

public class TravelPlannerController {

	@Autowired
	TravelPlannerService travelplannerservice;
	
	
	
	@GetMapping("/TravelPlanner")
	public String registerTravelData(Model model) {
		TravelForm tf = new TravelForm();
		model.addAttribute("travelform",tf);
		return "traveldetails";
	}
	
	@PostMapping("/travelregistration")
	public String saveTravelData(Model model,@Valid @ModelAttribute("travelform") TravelForm tf, BindingResult results) {
		if(results.hasErrors()) {
			
			return "traveldetails";
		}
		
		travelplannerservice.addData(tf);
		 return "Success";
	}
	
	@RequestMapping("/data")
	public String getTravellersList(Model model) {
//		ModelAndView mav = new ModelAndView("travellist");
//		List<TravelForm> travellerslist = travelplannerservice.getTravellersList(travelform);
//		System.out.println(travellerslist);
//		mav.addObject("travellerslist", travellerslist);
//		return mav;
		
		//OR
		List<TravelForm> travellerslist = travelplannerservice.getTravellersList();
		model.addAttribute("travellerslist",travellerslist);
		return "travellist";
	}
	
	
	
	
}
