package com.girlsfun.dogParkTracker.repositories;

import com.girlsfun.dogParkTracker.entities.DogOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogOwnerRepository extends JpaRepository<DogOwner, Integer> {
}
