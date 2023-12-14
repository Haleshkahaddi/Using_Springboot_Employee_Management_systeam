package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.repo.ProductRepo;

@RestController
@RequestMapping("/pd")
public class Productcontroller {
	@Autowired
	public ProductRepo productrepo;
	@GetMapping("/home")
	public String homePage()
	{
		return "Welcome to Product Management Systeam";
		
	}
	@PostMapping("/addpd")
	public ResponseEntity<Product>addProduct(@RequestBody Product product)
	{
		Product pd=productrepo.save(product);
		return new ResponseEntity <Product>( pd,HttpStatus.CREATED);
		
	}

}
