package com.example.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.UsedService;

public interface UsedServiceRepository extends JpaRepository<UsedService, Integer> {
	UsedService findByUserIdAndStatusAndDateEndGreaterThan(int id, String status, Date dateNow);
	UsedService findById(int id);
	
	@Query(value = "select sum(amount) from transaction_history where responseCode='00'", nativeQuery = true)
	int getAmountDoanhThu();
	
	
}
