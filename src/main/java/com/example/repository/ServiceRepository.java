package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Service;


public interface ServiceRepository extends JpaRepository<Service, Integer>{
	Service findById(int id);
	
	@Query(value = "SELECT count(*) FROM service", nativeQuery = true)
	int getAmountDichVu();
}
