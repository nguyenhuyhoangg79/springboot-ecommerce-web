package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Product;
import java.io.*;

@Controller
public class MainController {
	private static List<Product> products = new ArrayList<Product>();

	static {
		products.add(new Product("1", "Samsung Galaxy s5- 2015", "img/product-1.jpg", 700.00, 1000.00));
		products.add(new Product("2", "Nokia Lumia 1320", "img/product-2.jpg", 899.00, 999.00));
	}

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("products", products);
		return "index";
	}

	@RequestMapping(value = { "/addToCart/productId={productId}" }, method = RequestMethod.GET)
	public String showAddToCart(Model model, 
			@PathVariable("productId") String productId	
			) {
		System.out.println("Hello" + productId.toString());
//        PersonForm personForm = new PersonForm();
//        model.addAttribute("personForm", personForm);
		return "cart";
	}

//	 @RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
//	    public String saveOrders(Model model, //
//	            @ModelAttribute("personForm") PersonForm personForm) {
//	 
//	        String firstName = personForm.getFirstName();
//	        String lastName = personForm.getLastName();
//	 
//	        if (firstName != null && firstName.length() > 0 //
//	                && lastName != null && lastName.length() > 0) {
//	            Person newPerson = new Person(firstName, lastName);
//	            persons.add(newPerson);
//	 
//	            return "redirect:/personList";
//	        }
//	 
//	        model.addAttribute("errorMessage", errorMessage);
//	        return "addPerson";
//	    }
}