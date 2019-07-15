package com.rabobank.git.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabobank.git.model.PRResponse;
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
	
	
	public List<PRResponse> pullRequestDetailsForRepo(String username,String repoName) {
		logger.info("Username/RepoName in Server Impl Layer : ",username + " / " +repoName);
		List<PRResponse> pullResponse = gitClient.pullRequestDetailsForRepo(username,repoName);
		return pullResponse;
	}


}
