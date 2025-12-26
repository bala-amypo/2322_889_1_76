package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "person_profile")
public class PersonProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false)
    private String email;
    
    @Column(unique = true, nullable = false)
    private String referenceId;
    
    private String personType;
    private String fullName;
    private String department;
    private Boolean relationshipDeclared = false;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getReferenceId() { return referenceId; }
    public void setReferenceId(String referenceId) { this.referenceId = referenceId; }
    
    public String getPersonType() { return personType; }
    public void setPersonType(String personType) { this.personType = personType; }
    
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public Boolean getRelationshipDeclared() { return relationshipDeclared; }
    public void setRelationshipDeclared(Boolean relationshipDeclared) { this.relationshipDeclared = relationshipDeclared; }
}