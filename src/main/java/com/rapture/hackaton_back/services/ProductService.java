package com.rapture.hackaton_back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapture.hackaton_back.model.Product;
import com.rapture.hackaton_back.repositories.ProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public Product updateProduct(Product product) {
		Product productToUpdate = getProductById(product.getId());
		if(productToUpdate != null) {
			productToUpdate.setDescription(product.getDescription());
			productToUpdate.setName(product.getName());
			productToUpdate.setPrice(product.getPrice());
			productToUpdate.setUnit(product.getUnit());
			productToUpdate.setUrlImage(product.getUrlImage());
			return productToUpdate;
		}
		return null;
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

}
