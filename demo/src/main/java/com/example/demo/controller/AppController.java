package com.example.demo.controller;


import com.example.demo.model.Products;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class AppController {

	@Autowired
	private ProductService service;
	
	@RequestMapping("/allProducts")
	public List<Products> viewHomePage() {
		List<Products> listProducts = service.listAll();
//		model.addAttribute("listProducts", listProducts);
		
		return listProducts;
	}
	
//	@RequestMapping("/new")
//	public String showNewProductPage(Model model) {
//		Product product = new Product();
//		model.addAttribute("product", product);
//
//		return "new_product";
//	}
	
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public Products saveProduct(@RequestBody Products product) {
		service.save(product);
		return service.save(product);
	}
	
	@RequestMapping("/edit/{id}")
	public Products showEditProductPage(@PathVariable(value = "id") int id) {
//		ModelAndView mav = new ModelAndView("edit_product");
		Products product = service.get(id);
//		mav.addObject("product", product);
		return product;
	}
	
//	@RequestMapping("/delete/{id}")
//	public String deleteProduct(@PathVariable(name = "id") int id) {
//		service.delete(id);
//		return "redirect:/";
//	}
}
