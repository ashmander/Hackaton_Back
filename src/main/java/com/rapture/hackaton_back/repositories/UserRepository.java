package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
