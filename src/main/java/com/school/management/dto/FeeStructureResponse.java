package com.school.management.dto;

import java.util.List;

import com.school.management.entity.FeeComponent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeeStructureResponse {
    private String classLevel;
    private List<FeeComponent> feeComponents;
    private double totalAmount;

    public FeeStructureResponse(String classLevel, List<FeeComponent> feeComponents, double totalAmount) {
        this.classLevel = classLevel;
        this.feeComponents = feeComponents;
        this.totalAmount = totalAmount;
    }
}