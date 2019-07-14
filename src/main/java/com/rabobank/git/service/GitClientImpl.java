package com.rabobank.git.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabobank.git.model.ReposResponse;

/**
 * 
 * @author vinodhr
 *
 */
@Service
public class GitClientImpl {
	
	public Logger logger = LoggerFactory.getLogger(GitClientImpl.class);
	
	@Autowired
	private IGitClient gitClient;

	public List<ReposResponse> fetchAllPublicRepos(String username) {
		logger.info("Username in Server Impl Layer : ",username);
		List<ReposResponse> reposList = gitClient.fetchAllPublicRepos(username);
		return reposList;
	}


}
