package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.pojos.Product;

public interface ProductService {

	public void addProduct(Product product);

	public List<Product> listProduct();
	
	public Optional<Product> getProductById(long productId);
	
	public List<Product> findByCategory(long categoryId);
	
	public void deleteProduct(long productId);

}
