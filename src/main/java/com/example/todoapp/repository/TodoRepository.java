package com.example.todoapp.repository;

import com.example.todoapp.entity.Todo;
import com.example.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
