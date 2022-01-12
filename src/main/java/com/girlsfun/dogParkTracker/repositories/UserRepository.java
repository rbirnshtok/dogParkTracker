package com.girlsfun.dogParkTracker.repositories;

import com.girlsfun.dogParkTracker.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
