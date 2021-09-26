package com.rapture.hackaton_back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapture.hackaton_back.model.Consumer;
import com.rapture.hackaton_back.model.Product;
import com.rapture.hackaton_back.repositories.ConsumerRepository;

@Service
public class ConsumerService implements IConsumerService {
	
	@Autowired
	private ConsumerRepository consumerRepository;

	@Autowired
	private IProductService productService;
	
	@Override
	public Consumer createConsumer(Consumer consumer, Long productId) {
		Product product = productService.getProductById(productId);
		if(product != null) {
			consumer.getQualifications().get(0).setProduct(product);
			return consumerRepository.save(consumer);
		}
		return null;
	}

	@Override
	public Consumer getConsumerById(Long id) {
		return consumerRepository.findById(id).orElse(null);
	}

	@Override
	public List<Consumer> getByProduct(Long productId) {
		return null;
	}

	@Override
	public Consumer updateConsumer(Consumer consumer) {
		Consumer consumerToUpdate = getConsumerById(consumer.getId());
		if(consumerToUpdate != null) {
			consumerToUpdate.setAge(consumer.getAge());
			consumerToUpdate.setName(consumer.getName());
			consumerToUpdate.setCity(consumer.getCity());
			return consumerToUpdate;
		}
		return null;
	}

	@Override
	public void deleteConsumer(Long id) {
		consumerRepository.deleteById(id);
	}

}
