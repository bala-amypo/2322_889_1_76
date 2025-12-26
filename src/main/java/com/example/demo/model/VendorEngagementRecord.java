package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vendor_engagement_record")
public class VendorEngagementRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long employeeId;
    private Long vendorId;
    private String engagementType;
    private Double amount;
    private LocalDate engagementDate;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }
    
    public Long getVendorId() { return vendorId; }
    public void setVendorId(Long vendorId) { this.vendorId = vendorId; }
    
    public String getEngagementType() { return engagementType; }
    public void setEngagementType(String engagementType) { this.engagementType = engagementType; }
    
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    
    public LocalDate getEngagementDate() { return engagementDate; }
    public void setEngagementDate(LocalDate engagementDate) { this.engagementDate = engagementDate; }
}