package com.bleach.serviceImpl;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bleach.baseException.BaseException;
import com.bleach.entity.CustomerEntity;
import com.bleach.repositories.CustomerRepository;
import com.bleach.service.LoginService;
import com.bleach.util.StringUtil;
import com.bleach.vo.req.LoginReqVO;
import com.bleach.vo.res.LoginResVO;


@Service
public class LoginServiceImpl implements LoginService {
	
	private static final Logger logger = LogManager.getLogger(LoginServiceImpl.class);
	@Autowired
	private CustomerRepository customerRepository;

	
	
	public LoginResVO startAction(LoginReqVO loginReqVO) throws BaseException{
		logger.info("---------------------------startAction 開始---------------------------");
		String loginAcnt = loginReqVO.getLoginAcnt();
		String custPwd = loginReqVO.getCustPwd();
		LoginResVO userInfo = new LoginResVO();
		try {
			if(StringUtil.isBlank(loginAcnt) || StringUtil.isBlank(custPwd)){
				throw new BaseException("123", "帳號或密碼不得為空!");
			}
			CustomerEntity dbInfo = getUserInfo(loginAcnt, custPwd);
			if(dbInfo == null) {
				throw new BaseException("123", "查無資料!");
			}
			userInfo.setCustId(dbInfo.getCustId());
			userInfo.setCustName(dbInfo.getCustName());
			userInfo.setCustZodiacSign(dbInfo.getCustZodiacSign());
			userInfo.setLoginAcnt(dbInfo.getLoginAcnt());
			userInfo.setCustPwd(dbInfo.getLoginAcnt());
			userInfo.setCustAddress(dbInfo.getCustAddress());
			userInfo.setCustTel(dbInfo.getCustTel());
			userInfo.setAge(dbInfo.getAge());
			userInfo.setSex(dbInfo.getSex());
		} catch (BaseException be) {
			be.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		logger.info("---------------------------startAction 結束---------------------------");
		return userInfo;
	};

	public CustomerEntity getUserInfo(String loginAcnt, String custPwd) {
		CustomerEntity custInfo = customerRepository.findByAcntAndPwd(loginAcnt, custPwd);
		return custInfo;
	}
}
