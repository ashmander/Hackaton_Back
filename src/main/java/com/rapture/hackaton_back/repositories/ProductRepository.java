package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
