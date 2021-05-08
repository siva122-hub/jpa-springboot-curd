package com.example.demo.service;


import com.example.demo.model.Products;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService implements  IProductService{




	@Autowired
	private ProductRepository repo;
	
	public List<Products> listAll() {
		return repo.findAll();
	}
	
	public Products save(Products product) {
		repo.save(product);
        return product;
    }
	
	public Products get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
