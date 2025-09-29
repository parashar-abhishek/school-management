package com.school.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.management.dto.FeeStructureResponse;
import com.school.management.entity.FeeComponent;
import com.school.management.repository.FeeComponentRepository;

@Service
public class FeeService {

	@Autowired
	private FeeComponentRepository feeComponentRepository;
	
	public FeeStructureResponse getFeeStructure(String classLevel) throws Exception {
	    List<FeeComponent> components = feeComponentRepository.findByClassLevel(classLevel.toUpperCase());
	    if (components.isEmpty()) {
	        throw new Exception("No fee structure for class: " + classLevel);
	    }
	    double totalAmount = components.stream().mapToDouble(FeeComponent::getAmount).sum();
	    return new FeeStructureResponse(classLevel, components, totalAmount);
	}

}
