package com.bleach.service;

import com.bleach.entity.CustomerEntity;
import com.bleach.vo.req.LoginReqVO;
import com.bleach.vo.res.LoginResVO;

public interface LoginService {
	
	public LoginResVO startAction(LoginReqVO loginReqVO);
	
	public CustomerEntity getUserInfo(String custId, String loginAcnt, String custPwd);
}
