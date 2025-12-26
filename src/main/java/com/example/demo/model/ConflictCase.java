package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "conflict_case")
public class ConflictCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long primaryPersonId;
    private Long secondaryPersonId;
    private String triggerSource;
    private String riskLevel;
    private String status = "OPEN";

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Long getPrimaryPersonId() { return primaryPersonId; }
    public void setPrimaryPersonId(Long primaryPersonId) { this.primaryPersonId = primaryPersonId; }
    
    public Long getSecondaryPersonId() { return secondaryPersonId; }
    public void setSecondaryPersonId(Long secondaryPersonId) { this.secondaryPersonId = secondaryPersonId; }
    
    public String getTriggerSource() { return triggerSource; }
    public void setTriggerSource(String triggerSource) { this.triggerSource = triggerSource; }
    
    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}