package com.rapture.hackaton_back.services;

import java.util.List;

import com.rapture.hackaton_back.model.Consumer;

public interface IConsumerService {

	public Consumer createConsumer(Consumer consumer);
	
	public Consumer getConsumerById(Long id);
	
	public List<Consumer> getByProduct(Long productId);
}
