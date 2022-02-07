package com.github.anth.bray.RESTAPI.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser(@RequestParam Long id){
        return List.of(userService.getUser(id));
    }

    @PutMapping
    public void updateUser(@RequestParam Long id, @RequestParam String name){
        userService.updateUser(id, name);
    }
}
