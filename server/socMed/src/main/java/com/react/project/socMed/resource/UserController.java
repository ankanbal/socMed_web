package com.react.project.socMed.resource;

import com.react.project.socMed.model.Login;
import com.react.project.socMed.model.Register;
import com.react.project.socMed.repository.LoginRepo;
import com.react.project.socMed.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private UserRepo userRepo;
    private LoginRepo loginRepo;

    @Autowired
    public UserController(UserRepo userRepo, LoginRepo loginRepo) {
        this.userRepo = userRepo;
        this.loginRepo = loginRepo;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addUser")
    public String registerUser(@RequestBody Register user){
        user.setUserId(UUID.randomUUID());
        user.setUserPosts(0);
        user.setUserFriends(0);
        Date date = new Date();
        user.setUserDate(date);
        userRepo.save(user);
        Login login = new Login(user.getUserId(), false, user.getUserEmail(), user.getUserPassword());
        loginRepo.save(login);
        return "User Added";
    }
}
