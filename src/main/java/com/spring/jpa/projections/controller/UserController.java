package com.spring.jpa.projections.controller;

import com.spring.jpa.projections.domain.User;
import com.spring.jpa.projections.model.UserDto;
import com.spring.jpa.projections.model.UserRequestDto;
import com.spring.jpa.projections.model.response.Response;
import com.spring.jpa.projections.model.response.SuccessDataResponse;
import com.spring.jpa.projections.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public SuccessDataResponse createUser(@RequestBody UserRequestDto userRequestDto){
        return new SuccessDataResponse<>("User saved.", userService.createUser(userRequestDto));

    }

    @GetMapping("")
    public Response getUsers(){
        return new SuccessDataResponse<>("User Takes Successfully",userService.getUsers());

    }

    @PutMapping("/{userId}")
    public Response updateUser(@PathVariable("userId")int userId, @RequestBody UserRequestDto userRequestDto){
        return new SuccessDataResponse<>("User Records Retrieved Successfully",userService.updateUser(userId, userRequestDto));

    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId")int userId){
        userService.deleteUser(userId);
    }
}
