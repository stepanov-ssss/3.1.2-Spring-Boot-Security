package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.spring.boot_security.demo.models.User;

public interface UserRepositories extends JpaRepository<User, Long> {
   public User findByUsername(String username);
}
