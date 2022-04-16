package vn.com.todolist.repository;

import org.springframework.data.repository.Repository;
import vn.com.todolist.model.User;

import java.util.Optional;

public interface UserRepository extends Repository<User, Long> {
    Optional<User> findByEmail(String email);
    void save(User user);
}
