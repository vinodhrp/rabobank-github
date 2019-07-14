package com.rabobank.git.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rabobank.git.model.ReposResponse;

/**
 * 
 * @author vinodhr
 *
 */
@FeignClient(name = "git-client-api", url = "${github.api.url}")
public interface IGitClient {

	@GetMapping("/users/{username}/repos")
	public List<ReposResponse> fetchAllPublicRepos(@PathVariable("username") String username);

}
