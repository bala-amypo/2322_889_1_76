package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "conflict_cases")
public class ConflictCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long primaryPersonId;
    private Long secondaryPersonId;
    private String triggerSource;
    private String riskLevel;
    private String details;
    private String status;
    private LocalDateTime detectedAt;

    public ConflictCase() {
        this.status = "OPEN";
        this.detectedAt = LocalDateTime.now();
    }

    public ConflictCase(Long id, Long primaryPersonId, Long secondaryPersonId,
                        String triggerSource, String riskLevel, String details,
                        String status, LocalDateTime detectedAt) {
        this.id = id;
        this.primaryPersonId = primaryPersonId;
        this.secondaryPersonId = secondaryPersonId;
        this.triggerSource = triggerSource;
        this.riskLevel = riskLevel;
        this.details = details;
        this.status = status;
        this.detectedAt = detectedAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getPrimaryPersonId() { return primaryPersonId; }
    public void setPrimaryPersonId(Long primaryPersonId) {
        this.primaryPersonId = primaryPersonId;
    }

    public Long getSecondaryPersonId() { return secondaryPersonId; }
    public void setSecondaryPersonId(Long secondaryPersonId) {
        this.secondaryPersonId = secondaryPersonId;
    }

    public String getTriggerSource() { return triggerSource; }
    public void setTriggerSource(String triggerSource) {
        this.triggerSource = triggerSource;
    }

    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getDetectedAt() { return detectedAt; }
    public void setDetectedAt(LocalDateTime detectedAt) {
        this.detectedAt = detectedAt;
    }
}
