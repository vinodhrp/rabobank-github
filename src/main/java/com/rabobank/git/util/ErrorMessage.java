package com.rabobank.git.util;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author vinodhr
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

	private HttpStatus httpStatus;

	private String message;
}
