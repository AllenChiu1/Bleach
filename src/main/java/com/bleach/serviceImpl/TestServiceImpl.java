package com.bleach.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bleach.repositories.CustomerRepository;
import com.bleach.service.TestService;
import com.bleach.vo.req.TestReqVO;
import com.bleach.vo.res.TestResVO;

public class TestServiceImpl implements TestService {

	@Autowired
	private CustomerRepository customerRepository;

	public TestResVO startAction(TestReqVO testReqVO) {
		TestResVO dbInfo = new TestResVO();
		TestResVO userInfo = new TestResVO();
		dbInfo = getUserInfo(testReqVO.getInputId());
		userInfo.setCustId(dbInfo.getCustId());
		userInfo.setCustName(dbInfo.getCustName());
		userInfo.setCustCompany(dbInfo.getCustCompany());
		userInfo.setCustCompanyTel(dbInfo.getCustCompanyTel());
		userInfo.setCustCompanyAddress(dbInfo.getCustCompanyAddress());

		return userInfo;
	};

	public TestResVO getUserInfo(String custId) {
		TestResVO custInfo = new TestResVO();
		custInfo = customerRepository.findByID(custId);
		return custInfo;
	}
}
