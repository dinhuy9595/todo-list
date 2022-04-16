package vn.com.todolist.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import vn.com.todolist.model.User;

public interface UserService {
    User loadUserByUsername(String username) throws UsernameNotFoundException;
}
