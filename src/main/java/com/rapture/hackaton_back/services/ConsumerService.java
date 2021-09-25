package com.rapture.hackaton_back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rapture.hackaton_back.model.Consumer;
import com.rapture.hackaton_back.repositories.ConsumerRepository;

public class ConsumerService implements IConsumerService {
	
	@Autowired
	private ConsumerRepository consumerRepository;

	@Override
	public Consumer createConsumer(Consumer consumer) {
		return consumerRepository.save(consumer);
	}

	@Override
	public Consumer getConsumerById(Long id) {
		return consumerRepository.findById(id).orElse(null);
	}

	@Override
	public List<Consumer> getByProduct(Long productId) {
		return null;
	}

}
