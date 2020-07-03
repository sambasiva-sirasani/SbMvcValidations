package com.siva.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
