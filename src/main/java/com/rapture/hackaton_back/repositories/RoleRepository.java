package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
