package com.bleach.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bleach.entity.CustomerEntity;
import com.bleach.repositories.CustomerRepository;
import com.bleach.service.LoginService;
import com.bleach.util.StringUtil;
import com.bleach.vo.req.LoginReqVO;
import com.bleach.vo.res.LoginResVO;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private CustomerRepository customerRepository;

	public LoginResVO startAction(LoginReqVO loginReqVO) {
		String custId = loginReqVO.getCustId();
		String loginAcnt = loginReqVO.getLoginAcnt();
		String custPwd = loginReqVO.getCustPwd();
		LoginResVO userInfo = new LoginResVO();
		if(StringUtil.isBlank(custId) || StringUtil.isBlank(loginAcnt) || 
				StringUtil.isBlank(custPwd)){
//			log.info();
			System.out.println("不得為空!");
		}
		CustomerEntity dbInfo = getUserInfo(custId, loginAcnt, custPwd);
		userInfo.setCustId(dbInfo.getCustId());
		userInfo.setCustName(dbInfo.getCustName());
		userInfo.setCustZodiacSign(dbInfo.getCustZodiacSign());
		userInfo.setLoginAcnt(dbInfo.getLoginAcnt());
		userInfo.setCustPwd(dbInfo.getLoginAcnt());
		userInfo.setCustAddress(dbInfo.getCustAddress());
		userInfo.setCustTel(dbInfo.getCustTel());
		userInfo.setAge(dbInfo.getAge());
		userInfo.setSex(dbInfo.getSex());
		
		return userInfo;
	};

	public CustomerEntity getUserInfo(String custId, String loginAcnt, String custPwd) {
		CustomerEntity custInfo = customerRepository.findByCustId(custId);
		return custInfo;
	}
}
