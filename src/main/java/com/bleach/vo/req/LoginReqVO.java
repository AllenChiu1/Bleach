package com.bleach.vo.req;

public class LoginReqVO {
	
	private String custId;
	private String loginAcnt;
	private String custPwd;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getLoginAcnt() {
		return loginAcnt;
	}
	public void setLoginAcnt(String loginAcnt) {
		this.loginAcnt = loginAcnt;
	}
	public String getCustPwd() {
		return custPwd;
	}
	public void setCustPwd(String custPwd) {
		this.custPwd = custPwd;
	}
	
}
