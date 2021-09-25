package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.Qualification;

public interface QualificationRepository extends JpaRepository<Qualification, Long> {

}
