package guru.springframework.controller;

import guru.springframework.domain.UserCommand;
import guru.springframework.entity.User;

public class UserController {

    public User saveUser(UserCommand userCommand) {
        // fake impl
        return new User();
    }
}
