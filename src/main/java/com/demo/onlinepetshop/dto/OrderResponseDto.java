package com.demo.onlinepetshop.dto;

public class OrderResponseDto {
	
	private String message;
	private Integer statusCode;
	private Long orderHistoryId;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public Long getOrderHistoryId() {
		return orderHistoryId;
	}
	public void setOrderHistoryId(Long orderHistoryId) {
		this.orderHistoryId = orderHistoryId;
	}
}