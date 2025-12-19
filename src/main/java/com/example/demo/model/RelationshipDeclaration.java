package com.example.demo.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class RelationshipDeclaration {
    @Id
    private Long id;
    private Long personId;
    private String relatedPersonName;
    private String relationshipType;
    private String description;
    private LocalDateTime declaredAt;
    private boolean isVerified;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getPersonId() {
        return personId;
    }
    public void setPersonId(Long personId) {
        this.personId = personId;
    }
    public String getRelatedPersonName() {
        return relatedPersonName;
    }
    public void setRelatedPersonName(String relatedPersonName) {
        this.relatedPersonName = relatedPersonName;
    }
    public String getRelationshipType() {
        return relationshipType;
    }
    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDateTime getDeclaredAt() {
        return declaredAt;
    }
    public void setDeclaredAt(LocalDateTime declaredAt) {
        this.declaredAt = declaredAt;
    }
    public boolean isVerified() {
        return isVerified;
    }
    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }
    public RelationshipDeclaration() {
    }
    public RelationshipDeclaration(Long id, Long personId, String relatedPersonName, String relationshipType,
            String description, LocalDateTime declaredAt, boolean isVerified) {
        this.id = id;
        this.personId = personId;
        this.relatedPersonName = relatedPersonName;
        this.relationshipType = relationshipType;
        this.description = description;
        this.declaredAt = declaredAt;
        this.isVerified = isVerified;
    }
    
}
