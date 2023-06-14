package com.locationweb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locationweb.entities.Locations;
import com.locationweb.repositories.LocationRepository;

@RestController
public class LocationRestController1 {
	
	@Autowired
	private LocationRepository locationRepo;
    @RequestMapping("/locations/{id}") 
	public Locations findOneLocation(@PathVariable("id") long id) {
		try {
			Optional<Locations> findById = locationRepo.findById(id);
			Locations location = findById.get();
			return location;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
