package com.exam.vinayEndTermProject.repository;

import com.exam.vinayEndTermProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
    List<User> findById(String id);
}
