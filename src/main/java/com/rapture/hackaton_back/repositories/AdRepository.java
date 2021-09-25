package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.Ad;

public interface AdRepository extends JpaRepository<Ad, Long> {

}
