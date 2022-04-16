package vn.com.todolist.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import vn.com.todolist.model.User;
import vn.com.todolist.repository.UserRepository;
import vn.com.todolist.service.UserService;
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    @Transactional
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
    }
}
