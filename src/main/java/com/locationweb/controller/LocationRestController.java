package com.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locationweb.entities.Locations;
import com.locationweb.repositories.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRestController {

	@Autowired
	LocationRepository locationRepo;

	@GetMapping
	public List<Locations> listAllLocations() {

		List<Locations> locations = locationRepo.findAll();
		return locations;

	}

	@PostMapping
	public void setOneLocation(@RequestBody Locations location) {

		locationRepo.save(location);

	}

	@PutMapping
	public void updateOneLocation(@RequestBody Locations location) {

		locationRepo.save(location);

	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneLocation(@PathVariable("id") long id) {
		
		locationRepo.deleteById(id);
		
	}
	

}
