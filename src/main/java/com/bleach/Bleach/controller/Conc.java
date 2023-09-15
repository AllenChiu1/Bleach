package com.bleach.Bleach.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Conc {
	
	@PostMapping("/test")
	public ResponseEntity<?> doAction() {
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}