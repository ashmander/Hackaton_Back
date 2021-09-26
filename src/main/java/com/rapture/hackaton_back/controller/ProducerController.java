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

import com.rapture.hackaton_back.model.Producer;
import com.rapture.hackaton_back.services.IProducerService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/producers")
public class ProducerController {

	@Autowired
	private IProducerService producerService;
	
	@PostMapping("")
	public Producer createProducer(@RequestBody Producer producer) {
		return producerService.save(producer);
	}
	
	@GetMapping("/{id}")
	public Producer getProduct(@PathVariable Long id) {
		return producerService.getProducerById(id);
	}
	
	@PutMapping("")
	public Producer updateProduct(@RequestBody Producer product) {
		return producerService.updateProducer(product);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		producerService.deleteProducer(id);
	}
}
