package com.example.demo.service;



import com.example.demo.model.Products;

import java.util.List;

public interface IProductService {
    public List<Products> listAll();
    public Products save(Products product);
    public Products get(long id);
    public void delete(long id);
}
