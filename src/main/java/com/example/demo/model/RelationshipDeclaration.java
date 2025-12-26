package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "relationship_declaration")
public class RelationshipDeclaration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long personId;
    private String relatedPersonName;
    private String relationshipType;
    private Boolean isVerified = false;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Long getPersonId() { return personId; }
    public void setPersonId(Long personId) { this.personId = personId; }
    
    public String getRelatedPersonName() { return relatedPersonName; }
    public void setRelatedPersonName(String relatedPersonName) { this.relatedPersonName = relatedPersonName; }
    
    public String getRelationshipType() { return relationshipType; }
    public void setRelationshipType(String relationshipType) { this.relationshipType = relationshipType; }
    
    public Boolean getIsVerified() { return isVerified; }
    public void setIsVerified(Boolean isVerified) { this.isVerified = isVerified; }
}