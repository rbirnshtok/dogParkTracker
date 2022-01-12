package com.girlsfun.dogParkTracker.restcontroller;

import com.girlsfun.dogParkTracker.entities.User;
import com.girlsfun.dogParkTracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class DogParkAdminController {
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public void signup(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PostMapping("/login/{username}/{password}")
    public void login(@PathVariable String username, String password) {
        //TODO
    }
}
