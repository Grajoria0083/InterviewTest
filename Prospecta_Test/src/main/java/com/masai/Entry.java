package com.masai;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {

	@JsonProperty("API")
	private String api;
	
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("Auth")
	private String auth;
	
	@JsonProperty("Https")
	private boolean https;
	
	@JsonProperty("Category")
	private String category;
	
	@JsonProperty("Cors")
	private String cors;
	
	
	
	
	public Entry() {

	}
	
	public Entry(String api, String description, String auth, boolean https, String category, String cors) {
		super();
		this.api = api;
		this.description = description;
		this.auth = auth;
		this.https = https;
		this.category = category;
		this.cors = cors;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public boolean isHttps() {
		return https;
	}

	public void setHttps(boolean https) {
		this.https = https;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCors() {
		return cors;
	}

	public void setCors(String cors) {
		this.cors = cors;
	}
	
	
	
	
}
