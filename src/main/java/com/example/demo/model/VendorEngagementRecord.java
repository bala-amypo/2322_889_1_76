package com.example.demo.model;
import jakarta.presistance.*
import java.time.LocalDate;

public class VendorEngagementRecord {
    @Id
    private Long id;
    private Long employeeId;
    private Long vendorId;
    private String engagementType;
    private Double amount;
    private LocalDate engagementDate;
    private String notes;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
    public Long getVendorId() {
        return vendorId;
    }
    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }
    public String getEngagementType() {
        return engagementType;
    }
    public void setEngagementType(String engagementType) {
        this.engagementType = engagementType;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public LocalDate getEngagementDate() {
        return engagementDate;
    }
    public void setEngagementDate(LocalDate engagementDate) {
        this.engagementDate = engagementDate;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public VendorEngagementRecord(Long id, Long employeeId, Long vendorId, String engagementType, Double amount,
            LocalDate engagementDate, String notes) {
        this.id = id;
        this.employeeId = employeeId;
        this.vendorId = vendorId;
        this.engagementType = engagementType;
        this.amount = amount;
        this.engagementDate = engagementDate;
        this.notes = notes;
    }
    public VendorEngagementRecord() {
    }
    

}
