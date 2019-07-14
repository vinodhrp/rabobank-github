package com.rabobank.git.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rabobank.git.constant.APIConstant;
import com.rabobank.git.constant.MappingConstant;
import com.rabobank.git.model.ReposResponse;
import com.rabobank.git.service.GitClientImpl;
import com.rabobank.git.service.IGitClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author vinodhr
 *
 */

@RestController
@RequestMapping(MappingConstant.REPOS_ENTRY_PATH)
@Api(value = APIConstant.REPO_CNTRLR_DESC)
public class RepoGitContoller {

	@Autowired
	private IGitClient gitClient;

	@ApiOperation(value = APIConstant.CNTRLLR_GET_REPOS_DESC, httpMethod = APIConstant.API_GET)
	@RequestMapping(value = "/{userName}", method = RequestMethod.GET)
	public ResponseEntity<?> listAllRepos(@PathVariable("userName") String userName) {
		List<ReposResponse> reposResponses = gitClient.fetchAllPublicRepos(userName);
		return new ResponseEntity<List<ReposResponse>>(reposResponses, HttpStatus.OK);
	}

}
