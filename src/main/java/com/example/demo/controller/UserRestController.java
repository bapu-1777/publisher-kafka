package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class is used to handle user requests
 *
 * @author Mayank Vekariya
 *
 */

@RestController
public class UserRestController {
    @Autowired
    private UserService userService;

    /**
     * These methods are used to Customer records in post request
     * @return
     */

     @PostMapping("/users")
     public String maltipalUsers(@RequestBody List<User> userList){
         return userService.moreUsers(userList);
     }

     @PostMapping("/user")
     public String singleUser(@RequestBody User user){
         System.out.println("1");
         return userService.singleUser(user);
     }


}
