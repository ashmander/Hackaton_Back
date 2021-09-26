package com.rapture.hackaton_back.services;

import java.util.List;

import com.rapture.hackaton_back.model.Consumer;

public interface IConsumerService {

	public Consumer createConsumer(Consumer consumer, Long productId);
	
	public Consumer getConsumerById(Long id);
	
	public List<Consumer> getByProduct(Long productId);
	
	public Consumer updateConsumer(Consumer consumer);
	
	public void deleteConsumer(Long id);
}
