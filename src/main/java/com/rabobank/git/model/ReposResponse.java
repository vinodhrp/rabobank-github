package com.rabobank.git.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rabobank.git.constant.APIConstant;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "full_name", "description", "url" })
@Getter
@Setter
public class ReposResponse {

	@ApiModelProperty(notes = APIConstant.REPO_ID)
	@JsonProperty("id")
	private Integer id;

	@ApiModelProperty(notes = APIConstant.REPO_NAME)
	@JsonProperty("name")
	private String name;

	@ApiModelProperty(notes = APIConstant.REPO_PATH)
	@JsonProperty("full_name")
	private String fullName;

	@ApiModelProperty(notes = APIConstant.REPO_DESC)
	@JsonProperty("description")
	private String description;

	@ApiModelProperty(notes = APIConstant.REPO_URL)
	@JsonProperty("url")
	private String url;

}
