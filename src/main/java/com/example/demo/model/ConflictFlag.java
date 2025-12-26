package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "conflict_flag")
public class ConflictFlag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long caseId;
    private String flagType;
    private String severity;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Long getCaseId() { return caseId; }
    public void setCaseId(Long caseId) { this.caseId = caseId; }
    
    public String getFlagType() { return flagType; }
    public void setFlagType(String flagType) { this.flagType = flagType; }
    
    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }
}