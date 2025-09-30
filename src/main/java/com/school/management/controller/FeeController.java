package com.school.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.management.dto.FeeStructureResponse;
import com.school.management.service.FeeService;

@RestController
@RequestMapping("/fee")
public class FeeController {

	@Autowired
	private FeeService feeService;

	@GetMapping("/get_fee_structure")
	public FeeStructureResponse getFeeStructure(@RequestParam String classLevel) throws Exception {
		return feeService.getFeeStructure(classLevel);
	}

	@GetMapping("/payment_history")
	public String getPaymentHistory(@RequestParam Long studentId, @RequestParam String academic_year) {
		return null;
	}

}