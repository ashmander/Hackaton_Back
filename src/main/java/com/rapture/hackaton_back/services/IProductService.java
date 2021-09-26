package com.rapture.hackaton_back.services;

import com.rapture.hackaton_back.model.Product;

public interface IProductService {

	public Product createProduct(Product product);
	
	public Product getProductById(Long id);
	
	public Product updateProduct(Product product);
	
	public void deleteProduct(Long id);
}
