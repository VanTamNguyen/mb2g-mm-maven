package guru.springframework.controller;

import guru.springframework.domain.UserCommand;
import guru.springframework.entity.User;
import guru.springframework.mapper.UserMapper;

public class UserController {

    public User saveUser(UserCommand userCommand) {
        // fake impl
        return UserMapper.INSTANCE.userCommandToUser(userCommand);
    }
}
