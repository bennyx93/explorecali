package com.example.ec.explorecali.repositories;

import com.example.ec.explorecali.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String userName);
}
