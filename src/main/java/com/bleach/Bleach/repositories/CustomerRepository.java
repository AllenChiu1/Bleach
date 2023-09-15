package com.bleach.Bleach.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bleach.Bleach.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String>{
	
	public CustomerEntity findByCustId(String custId);
}
