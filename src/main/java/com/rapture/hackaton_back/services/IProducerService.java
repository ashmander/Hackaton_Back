package com.rapture.hackaton_back.services;

import com.rapture.hackaton_back.model.Producer;

public interface IProducerService {

	public Producer save(Producer producer);

	public Producer getProducerById(Long id);

	public Producer updateProducer(Producer product);

	public void deleteProducer(Long id);

}
