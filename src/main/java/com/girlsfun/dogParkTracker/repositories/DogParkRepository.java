package com.girlsfun.dogParkTracker.repositories;

import com.girlsfun.dogParkTracker.entities.DogPark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogParkRepository extends JpaRepository<DogPark, Integer> {
}
