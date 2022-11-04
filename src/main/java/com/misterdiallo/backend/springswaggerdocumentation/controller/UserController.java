package com.misterdiallo.backend.springswaggerdocumentation.controller;

import com.misterdiallo.backend.springswaggerdocumentation.model.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/add-new-user")
    public UserModel createNewUser(@RequestBody UserModel userModel) {
        return userModel;
    }

    @PutMapping("/update-a-user/{userId}")
    public UserModel updateUser(@PathVariable String userId, @RequestBody UserModel userModel) {
        return userModel;
    }

    @DeleteMapping("/delete-a-user/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "User deleted successfully.";
    }

    @GetMapping("/get-one-user/{userId}")
    public UserModel getOneUser(@PathVariable String userId) {
        return new UserModel(
                "username",
                "email",
                20,
                "password"
        );
    }

    @GetMapping("/get-all-users")
    public List<UserModel> getAllUsers() {
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(
                "username0",
                "email0",
                20,
                "password0"
        ));
        users.add(new UserModel(
                "username1",
                "email1",
                21,
                "password1"
        ));
        users.add(new UserModel(
                "username2",
                "email2",
                22,
                "passwor2"
        ));
        return users;
    }
}
