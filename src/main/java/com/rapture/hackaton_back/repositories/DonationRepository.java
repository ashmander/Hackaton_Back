package com.rapture.hackaton_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapture.hackaton_back.model.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {

}
