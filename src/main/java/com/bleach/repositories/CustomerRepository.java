package com.bleach.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bleach.entity.CustomerEntity;
import com.bleach.vo.res.TestResVO;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String>{
	
	public TestResVO findByID(String custId);
}
