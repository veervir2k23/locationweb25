package com.locationweb.services;

import java.util.List;

import com.locationweb.entities.Locations;

public interface LocationService {
   public void saveLocation(Locations location);

   public List<Locations> allLocations();

public void deleteLocation(long id);

public Locations getLocation(long id);
}
