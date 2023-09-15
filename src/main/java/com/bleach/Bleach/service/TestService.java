package com.bleach.Bleach.service;

import com.bleach.Bleach.entity.CustomerEntity;
import com.bleach.Bleach.vo.req.TestReqVO;
import com.bleach.Bleach.vo.res.TestResVO;

public interface TestService {
	
	public TestResVO startAction(TestReqVO testReqVO);
	
	public CustomerEntity getUserInfo(String custId);
}
