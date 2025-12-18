package com.example.demo.model;
import jakarta.presistence.*
import java.time.LocalDateTime;

public class ConflictFlag {
    @Id
    private Long id;
    private Long caseId;
    private String flagType;
    private String description;
    private String severnity;
    private LocalDateTime flaggedAt;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCaseId() {
        return caseId;
    }
    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }
    public String getFlagType() {
        return flagType;
    }
    public void setFlagType(String flagType) {
        this.flagType = flagType;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSevernity() {
        return severnity;
    }
    public void setSevernity(String severnity) {
        this.severnity = severnity;
    }
    public LocalDateTime getFlaggedAt() {
        return flaggedAt;
    }
    public void setFlaggedAt(LocalDateTime flaggedAt) {
        this.flaggedAt = flaggedAt;
    }
    public ConflictFlag(Long id, Long caseId, String flagType, String description, String severnity,
            LocalDateTime flaggedAt) {
        this.id = id;
        this.caseId = caseId;
        this.flagType = flagType;
        this.description = description;
        this.severnity = severnity;
        this.flaggedAt = flaggedAt;
    }
    public ConflictFlag() {
    }
    
}
