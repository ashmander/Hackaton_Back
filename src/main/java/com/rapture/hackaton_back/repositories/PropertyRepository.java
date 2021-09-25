package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}
