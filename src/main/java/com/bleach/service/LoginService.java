package com.bleach.service;

import com.bleach.entity.CustomerEntity;
import com.bleach.vo.req.LoginReqVO;
import com.bleach.vo.res.LoginResVO;

public interface LoginService {
	
	public LoginResVO startAction(LoginReqVO loginReqVO) throws Exception;
	
	public CustomerEntity getUserInfo(String loginAcnt, String custPwd);
}
