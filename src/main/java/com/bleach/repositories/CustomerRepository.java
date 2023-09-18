package com.bleach.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bleach.entity.CustomerEntity;

@Repository("CustomerRepository")
public interface CustomerRepository extends JpaRepository<CustomerEntity, String>{
	
	@Query(value = "select * from CUSTOMER where cust_login_Acnt = :loginAcnt and cust_Pwd = :custPwd"
			, nativeQuery = true)
	public CustomerEntity findByAcntAndPwd(String loginAcnt, String custPwd);
}
