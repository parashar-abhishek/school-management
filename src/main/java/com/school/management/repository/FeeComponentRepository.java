package com.school.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.management.entity.FeeComponent;

@Repository
public interface FeeComponentRepository extends JpaRepository<FeeComponent, Long> {

	List<FeeComponent> findByClassLevel(String classLevel);

	
}
