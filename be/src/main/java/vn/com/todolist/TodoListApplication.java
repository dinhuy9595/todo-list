package vn.com.todolist;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.com.todolist.model.User;
import vn.com.todolist.repository.UserRepository;

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
	}
//	@Bean
//	public ApplicationRunner init(UserRepository repository) {
//
//		return args -> {
//			User user = new User();
//			user.setEmail("dinhuy@mgail.com");
//			repository.save(user);
//		};
//	}
}
