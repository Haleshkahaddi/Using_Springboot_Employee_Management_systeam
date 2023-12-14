package com.product.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repo.ProductRepo;
import com.product.service.Services;

@Service
public class Serviceimp implements Services {
    @Autowired         
	ProductRepo producrepo;
	@Override
	public Product addProduct(Product product) {
	Product pd=	producrepo.save(product);
		return pd;
	}

	@Override
	public String removeProduct(int id) {
		producrepo.deleteById(id);
		return "Deleted Succefully";
	}

	@Override
	public Optional<Product> findbyid(int id) {
		
		Optional<Product>pd=producrepo.findById(id);
		if(pd.isPresent())
		{
			return pd;
		}
		else
		{
		return Optional.empty();
		}
	}

	@Override
	public List<Product> getProduct() {
		List<Product>plist=producrepo.findAll();
		
		return plist;
	}

	@Override
	public String updateProduct(int id) {
		
		Optional<Product>pd=producrepo.findById(id);
		if(pd.isPresent())
		{
			Product p=new Product();
		producrepo.save(p);
		
		return "Updated Successfully";
		}
		return "Product Not Found";
	}

}
