package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.PlantFamily;

public interface PlantFamilyRepository extends JpaRepository<PlantFamily, Integer>{
	List<PlantFamily> findByVietnameseContainingOrEnglishContaining(String key1, String key2);
	List<PlantFamily> findByVietnameseNotNull();
}
