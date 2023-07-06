package com.learnwithankit.springbootawsankit.service;

import com.learnwithankit.springbootawsankit.dto.UserDto;
import com.learnwithankit.springbootawsankit.entity.User;

import java.util.List;

public interface UserService {

    public UserDto createUser(UserDto userDto);

    public UserDto getUserById(long id);

    public List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(long id);
}
