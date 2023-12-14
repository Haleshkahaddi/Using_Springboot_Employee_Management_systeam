package com.product.service;

import java.util.List;
import java.util.Optional;

import com.product.entity.Product;

public interface Services {
	public Product addProduct(Product product);
	public String removeProduct(int id);
	public Optional<Product>findbyid(int id);
	public List<Product>getProduct();
	public String updateProduct(int id);

}
