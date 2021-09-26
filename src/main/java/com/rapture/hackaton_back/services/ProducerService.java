package com.rapture.hackaton_back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapture.hackaton_back.model.Producer;
import com.rapture.hackaton_back.repositories.ProducerRepository;

@Service
public class ProducerService implements IProducerService {

	@Autowired
	private ProducerRepository producerRepository;
	
	@Override
	public Producer save(Producer producer) {
		return producerRepository.save(producer);
	}

	@Override
	public Producer getProducerById(Long id) {
		return producerRepository.findById(id).orElse(null);
	}

	@Override
	public Producer updateProducer(Producer producer) {
		Producer producerToUpdate = getProducerById(producer.getId());
		if(producerToUpdate != null) {
			producerToUpdate.setDescription(producer.getDescription());
			producerToUpdate.setName(producer.getName());
			producerToUpdate.setUrlImage(producer.getUrlImage());
			producerToUpdate.setCity(producer.getCity());
			producerToUpdate.setEmail(producer.getEmail());
			producerToUpdate.setPhoneNumber(producer.getPhoneNumber());
			return producerToUpdate;
		}
		return null;
	}

	@Override
	public void deleteProducer(Long id) {
		producerRepository.deleteById(id);
	}

}
