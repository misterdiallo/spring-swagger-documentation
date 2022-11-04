package com.misterdiallo.backend.springswaggerdocumentation.controller;

import com.misterdiallo.backend.springswaggerdocumentation.model.UserModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@Api(description = "It's provide the /api/users path and contains all the users paths inside", tags = "User Controller.", basePath = "/api/users")
@ApiResponses(value = {
        @ApiResponse(code=404, message = "404 error can only occure when there's an error in the url path.")
})
public class UserController {

    @PostMapping("/add-new-user")
    @ApiOperation(value = "Request to Add NEW USER. It accepts a USERMOEL and return a USERMODEL also")
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
