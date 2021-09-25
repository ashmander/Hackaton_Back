package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.Producer;

public interface ProducerRepository extends JpaRepository<Producer, Long> {

}
