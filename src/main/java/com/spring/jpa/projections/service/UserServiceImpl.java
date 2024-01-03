package com.spring.jpa.projections.service;

import com.spring.jpa.projections.domain.User;
import com.spring.jpa.projections.exceptions.BadRequestException;
import com.spring.jpa.projections.model.UserDto;
import com.spring.jpa.projections.model.UserRequestDto;
import com.spring.jpa.projections.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserRequestDto userRequestDto) {
        User newUser=new User();
        newUser.setFirstName(userRequestDto.getFirstName());
        newUser.setLastName(userRequestDto.getLastName());
        return userRepository.save(newUser);
    }

    @Override
    public List<UserDto> getUsers() {
        return userRepository.findAllBy();
    }

    @Override
    public UserDto updateUser(int userId, UserRequestDto userRequestDto) {
        User existUser=userRepository.findById(userId, User.class);
        if (existUser==null)throw new BadRequestException(String.format("User Not Found with Id:%s",userId));
        existUser.setFirstName(userRequestDto.getFirstName());
        existUser.setLastName(userRequestDto.getLastName());
        return userRepository.findById(userId);
    }

    @Override
    public void deleteUser(int userId) {
        User existUser=userRepository.findById(userId, User.class);
        if (existUser==null) throw new BadRequestException(String.format("User Not Found with Id:%s",userId));
        userRepository.delete(existUser);

    }
}
