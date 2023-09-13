package com.bleach.service;

import org.springframework.stereotype.Service;

import com.bleach.vo.req.TestReqVO;
import com.bleach.vo.res.TestResVO;

@Service
public interface TestService {
	
	public TestResVO startAction(TestReqVO testReqVO);
	
	public TestResVO getUserInfo(String custId);
}
