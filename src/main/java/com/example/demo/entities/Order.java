package com.example.demo.entities;
import lombok.Data;

@Data
public class Order {
	private String orderId;
	private String productId;
	private int quantity;
}
