package com.spring.jpa.projections.service;

import com.spring.jpa.projections.domain.User;
import com.spring.jpa.projections.model.UserDto;
import com.spring.jpa.projections.model.UserRequestDto;

import java.util.List;

public interface UserService {

    User createUser(UserRequestDto userRequestDto);

    List<UserDto> getUsers();

    UserDto updateUser(int userId,UserRequestDto userRequestDto);

    void deleteUser(int userId);
}
