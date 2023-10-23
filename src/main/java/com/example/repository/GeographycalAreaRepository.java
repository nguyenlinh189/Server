package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.GeographicalArea;

public interface GeographycalAreaRepository extends JpaRepository<GeographicalArea, Integer> {
	@Query(value = "select * from geographical_area limit 8", nativeQuery = true)
	List<GeographicalArea> getLimit8Area();
	List<GeographicalArea> findByEnglishContaining(String key);
	List<GeographicalArea> findByVietnameseNull();
	List<GeographicalArea> findByVietnameseNotNull();
}
