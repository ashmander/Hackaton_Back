package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
