package com.rabobank.git.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "full_name", "description", "url" })
@Getter
@Setter
public class ReposResponse {

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("full_name")
	private String fullName;

	@JsonProperty("description")
	private String description;

	@JsonProperty("url")
	private String url;

}
