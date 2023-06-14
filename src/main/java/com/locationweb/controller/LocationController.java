package com.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb.dto.LocationData;
import com.locationweb.entities.Locations;
import com.locationweb.services.LocationService;
import com.locationweb.utilities.EmailService;

@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@Autowired
    private EmailService emailService;
	
	@RequestMapping("/create")
	public String goToMyPage() {
		return "location";
	}
@RequestMapping("/saveLocation")	
public String saveOneLocation(@ModelAttribute("location")Locations location, ModelMap model) {
	locationService.saveLocation(location);
	emailService.sendSimpleMessage("chandrasekhar.beeligible@gmail.com", "Welcome chandrasekhar", "location is Saved");
	model.addAttribute("msg", "Location is saved!!");
	return "location";
	
}
//@RequestMapping("/saveLocation")
//public String saveOneLocation(@RequestParam("id") long id, @RequestParam("code")String code, @RequestParam("name")String name, @RequestParam("type")String type) {
//    Locations location = new Locations();
//    location.setId(id);
//    location.setCode(code);
//    location.setName(name);
//    location.setType(type);
//	return  "location";
//}
//	@RequestMapping(value="/saveLocation",method = RequestMethod.POST)
//	public String saveOneLocation(LocationData locationData, ModelMap model) {
//		Locations location = new Locations();
//		location.setId(locationData.getId());
//		location.setCode(locationData.getCode());
//		location.setName(locationData.getName());
//		location.setType(locationData.getType());
//		
//        locationService.saveLocation(location);
//        model.addAttribute("msg", "Location is saved");
//		return "location";
//	}

@RequestMapping("/list")
public String listAllLocations(ModelMap modelMap) {
	
	List<Locations> locations = locationService.allLocations();
	modelMap.addAttribute("locations", locations);
	return "listLocations";
	
}

@RequestMapping("/delete")
public String deleteLocation(@RequestParam("id") long id,ModelMap model) {
	locationService.deleteLocation(id);
	List<Locations> locations = locationService.allLocations();
	model.addAttribute("msg", "Location with id " +id+ " is Deleted");
	model.addAttribute("locations", locations);
	
	return "listLocations";
}
@RequestMapping("/update")
public String getLocationById(@RequestParam("id")long id, ModelMap model) {
	Locations location = locationService.getLocation(id);
	model.addAttribute("location", location);
	return "update_location";
}
	
	
}
