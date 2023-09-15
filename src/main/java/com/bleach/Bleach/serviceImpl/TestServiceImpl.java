package com.bleach.Bleach.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bleach.Bleach.entity.CustomerEntity;
import com.bleach.Bleach.repositories.CustomerRepository;
import com.bleach.Bleach.service.TestService;
import com.bleach.Bleach.vo.req.TestReqVO;
import com.bleach.Bleach.vo.res.TestResVO;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private CustomerRepository customerRepository;

	public TestResVO startAction(TestReqVO testReqVO) {
		TestResVO userInfo = new TestResVO();
		CustomerEntity dbInfo = getUserInfo(testReqVO.getInputId());
		userInfo.setCustId(dbInfo.getCustId());
		userInfo.setCustName(dbInfo.getCustName());
		userInfo.setCustCompany(dbInfo.getCustCompany());
		userInfo.setCustCompanyTel(dbInfo.getCustCompanyTel());
		userInfo.setCustCompanyAddress(dbInfo.getCustCompanyAddress());
		
		return userInfo;
	};

	public CustomerEntity getUserInfo(String custId) {
		CustomerEntity custInfo = customerRepository.findByCustId(custId);
		return custInfo;
	}
}
