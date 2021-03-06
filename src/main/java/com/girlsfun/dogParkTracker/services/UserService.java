package com.girlsfun.dogParkTracker.services;

import com.girlsfun.dogParkTracker.entities.User;
import com.girlsfun.dogParkTracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    public void saveUser(User User) {
        userRepository.save(User);
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
