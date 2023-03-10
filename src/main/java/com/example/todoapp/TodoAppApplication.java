package com.example.todoapp;

import com.example.todoapp.entity.Todo;
import com.example.todoapp.entity.User;
import com.example.todoapp.repository.TodoRepository;
import com.example.todoapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}
@Override
	public void run(String... args) throws Exception{
	User user = new User();
//	user.setId(1L);
	user.setUsername("khoa");
	user.setPassword("should be hashed");
	Todo todo = new Todo();
//	todo.setId(1L);
	todo.setContent("Type in your notes");
	user.getTodoList().add(todo);
//	todoRepository.save(todo);
	userRepository.save(user);
}
}
