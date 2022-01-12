package com.girlsfun.dogParkTracker.repositories;

import com.girlsfun.dogParkTracker.entities.DogOwnerParkMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogOwnerParkMapRepository extends JpaRepository<DogOwnerParkMap, Integer> {
}
