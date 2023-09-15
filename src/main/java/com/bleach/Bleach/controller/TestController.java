package com.bleach.Bleach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bleach.Bleach.service.TestService;
import com.bleach.Bleach.vo.req.TestReqVO;
import com.bleach.Bleach.vo.res.TestResVO;

@RestController
@RequestMapping("/test")
public class TestController {

 @Autowired
 private TestService testService;
 
 @PostMapping("/findById")
 public ResponseEntity<TestResVO> doAction(@RequestBody TestReqVO testReqVO) {
  TestResVO testResVO = new TestResVO();
  testResVO = testService.startAction(testReqVO);
  return ResponseEntity.status(HttpStatus.OK).body(testResVO);
 }
 
}