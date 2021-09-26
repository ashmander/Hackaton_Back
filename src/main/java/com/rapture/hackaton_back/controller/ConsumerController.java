package com.rapture.hackaton_back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rapture.hackaton_back.model.Consumer;
import com.rapture.hackaton_back.services.IConsumerService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/consumers")
public class ConsumerController {

	@Autowired
	private IConsumerService consumerService;
	
	@PostMapping("/{productId}")
	public Consumer createProducer(@RequestBody Consumer consumer, @PathVariable Long productId) {
		return consumerService.createConsumer(consumer, productId);
	}
	
	@GetMapping("/{id}")
	public Consumer getProduct(@PathVariable Long id) {
		return consumerService.getConsumerById(id);
	}
	
	@PutMapping("")
	public Consumer updateConsumer(@RequestBody Consumer consumer) {
		return consumerService.updateConsumer(consumer);
	}
	
	@DeleteMapping("/{id}")
	public void deleteConsumer(@PathVariable Long id) {
		consumerService.deleteConsumer(id);
	}
}
