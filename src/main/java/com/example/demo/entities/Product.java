package com.example.demo.entities;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Product {
	private String productId;
	private String productName;
	private String productImageUrl;
	private Double productOldPrice;
	private Double productPrice;
}
