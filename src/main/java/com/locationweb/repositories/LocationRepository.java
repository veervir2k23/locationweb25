package com.locationweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.locationweb.entities.Locations;

public interface LocationRepository extends JpaRepository<Locations, Long> {

}
