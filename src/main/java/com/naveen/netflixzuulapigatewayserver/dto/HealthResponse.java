package com.naveen.netflixzuulapigatewayserver.dto;

public class HealthResponse {

	private String status;

	public HealthResponse(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
}
