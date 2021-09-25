package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.Step;

public interface StepRepository extends JpaRepository<Step, Long> {

}
