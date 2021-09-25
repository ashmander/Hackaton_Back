package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.CodeQR;

public interface CodeQRRepository extends JpaRepository<CodeQR, Long> {

}
