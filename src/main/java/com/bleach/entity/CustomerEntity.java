package com.bleach.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUST_LOGIN_ACNT")
	private String loginAcnt;
	@Column(name="CUST_ID")
	private String custId;
	@Column(name="CUST_NAME")
	private String custName;
	@Column(name="CUST_ZODIAC_SIGN")
	private String custZodiacSign;
	@Column(name="CUST_PWD")
	private String custPwd;
	@Column(name="CUST_ADDRESS")
	private String custAddress;
	@Column(name="CUST_TEL")
	private String custTel;
	@Column(name="CUST_AGE")
	private String age;
	@Column(name="CUST_SEX")
	private String sex;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustZodiacSign() {
		return custZodiacSign;
	}
	public void setCustZodiacSign(String custZodiacSign) {
		this.custZodiacSign = custZodiacSign;
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
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustTel() {
		return custTel;
	}
	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
