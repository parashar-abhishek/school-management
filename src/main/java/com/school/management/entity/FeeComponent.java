package com.school.management.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="fee_component")
@Getter
@Setter
@Table
@NoArgsConstructor
@AllArgsConstructor
public class FeeComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fee_component_id")
    private Long feeComponentId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "class_level", nullable = false)
    private String classLevel;

    public FeeComponent(String name, double amount, String classLevel) {
        this.name = name;
        this.amount = amount;
        this.classLevel = classLevel;
    }

}