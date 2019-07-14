package com.rabobank.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * 
 * @author vinodhr
 *
 */
@SpringBootApplication
@EnableFeignClients
public class RabobankGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabobankGithubApplication.class, args);
	}

}
