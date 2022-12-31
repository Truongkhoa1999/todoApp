package com.example.todoapp.repository;

import com.example.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todoapp.entity.Todo;
public interface UserRepository extends JpaRepository<User,Long> {
}
