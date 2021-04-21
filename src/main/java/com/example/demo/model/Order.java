package com.example.demo.model;

public class Order {
	private String orderId;
	private String productId;
	private int quantity;

	public Order() {
	}
		
	public Order(String orderId, String productId, int quantity) {
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;	
	}

	public String getOrderId() {
		return this.orderId;
	}

	public String getProductId() {
		return this.productId;
	}

	public int quantity() {
		return this.quantity;
	}	
}
