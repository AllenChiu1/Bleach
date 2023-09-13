package com.bleach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bleach.service.TestService;
import com.bleach.vo.req.TestReqVO;
import com.bleach.vo.res.TestResVO;

@RestController
public class TestController {

	@Autowired
	private TestService testService;
	
	@PostMapping("/findById")
	public ResponseEntity<TestResVO> doAction(@RequestBody TestReqVO testReqVO) {
		System.out.println("近來controller了");
		TestResVO testResVO = new TestResVO();
		testResVO = testService.startAction(testReqVO);
		return ResponseEntity.status(HttpStatus.OK).body(testResVO);
	}
}
