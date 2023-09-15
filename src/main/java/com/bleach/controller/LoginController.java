package com.bleach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bleach.service.LoginService;
import com.bleach.vo.req.LoginReqVO;
import com.bleach.vo.res.LoginResVO;

@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/Login")
	public ResponseEntity<LoginResVO> doAction(@RequestBody LoginReqVO loginReqVO) {
		LoginResVO loginResVO = new LoginResVO();
		loginResVO = loginService.startAction(loginReqVO);
		return ResponseEntity.status(HttpStatus.OK).body(loginResVO);
	}

}