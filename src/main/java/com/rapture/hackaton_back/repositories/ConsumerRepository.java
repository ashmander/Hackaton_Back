package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.Consumer;

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
	

}
