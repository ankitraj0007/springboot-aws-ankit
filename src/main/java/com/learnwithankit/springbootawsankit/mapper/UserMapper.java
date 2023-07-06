package com.learnwithankit.springbootawsankit.mapper;

import com.learnwithankit.springbootawsankit.dto.UserDto;
import com.learnwithankit.springbootawsankit.entity.User;

//not a good way. better use 3rd party library like modelMapper and mapStruct
public class UserMapper {

    public static UserDto mapToUsetDto(User user){
        UserDto userDto = new UserDto(
            user.getId(),
            user.getFirstName(),
            user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }

    public static User mapToUser(UserDto userDto){
        User user = new User(
            userDto.getId(),
            userDto.getFirstName(),
            userDto.getLastName(),
            userDto.getEmail()
        );
        return user;
    }
}
