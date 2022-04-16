package vn.com.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.todolist.model.User;
import vn.com.todolist.modelview.response.UserResponse;
import vn.com.todolist.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/test")
    public UserResponse getUser(){
        User user =userService.loadUserByUsername("dinhuy@gmail.com");
        return  UserResponse.builder().id(user.getId()).email(user.getEmail()).build();
    }
}
