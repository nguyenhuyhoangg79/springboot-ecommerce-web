package com.example.demo.model;

public class Product {
	private String productId;
	private String productName;
	private String productImageUrl;
	private Double productOldPrice;
	private Double productPrice;
	private String productDescription;
	private String productCategory;
	private String productTags;

	public Product() {
	}

	public Product(String productName) {
		this.productName = productName;
	}

	public Product(String productName, String productImageUrl) {
		this.productName = productName;
		this.productImageUrl = productImageUrl;
	}

	public Product(String productId, String productName, String productImageUrl, Double productPrice, Double productOldPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productImageUrl = productImageUrl;
		this.productPrice = productPrice;
		this.productOldPrice = productOldPrice;
	}

	public String getProductName() {
		return this.productName;
	}

	public String getProductImageUrl() {
		return this.productImageUrl;
	}

	public Double getProductPrice() {
		return this.productPrice;
	}
	
	public Double getProductOldPrice() {
		return this.productOldPrice;
	}
	
	public String getProductId() {
		return this.productId;
	}
}
