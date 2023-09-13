package com.bleach.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "test")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String custId;
	@Column(name="CUST_NAME")
	private String custName;
	@Column(name="CUST_COMPANY")
	private String custCompany;
	@Column(name="CUST_COMPANY_TEL")
	private String custCompanyTel;
	@Column(name="CUST_COMPANY_ADDRESS")
	private String custCompanyAddress;
	
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
	public String getCustCompany() {
		return custCompany;
	}
	public void setCustCompany(String custCompany) {
		this.custCompany = custCompany;
	}
	public String getCustCompanyTel() {
		return custCompanyTel;
	}
	public void setCustCompanyTel(String custCompanyTel) {
		this.custCompanyTel = custCompanyTel;
	}
	public String getCustCompanyAddress() {
		return custCompanyAddress;
	}
	public void setCustCompanyAddress(String custCompanyAddress) {
		this.custCompanyAddress = custCompanyAddress;
	}
	
}
