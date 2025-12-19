package com.example.demo.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
public class PersonProfile{
    @Id
    private long id;
    private String personType;
    @Column(unique=true)
    private String referenceld;
    private String fullName;
    @Column(unique=true)
    private String email;
    private boolean relationshipDeclared;
    private LocalDateTime createdAt;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getPersonType() {
        return personType;
    }
    public void setPersonType(String personType) {
        this.personType = personType;
    }
    public String getReferenceld() {
        return referenceld;
    }
    public void setReferenceld(String referenceld) {
        this.referenceld = referenceld;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public bool getRelationshipDeclared() {
        return relationshipDeclared;
    }
    public void setRelationshipDeclared(bool relationshipDeclared) {
        this.relationshipDeclared = relationshipDeclared;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public PersonProfile() {
    }
    public PersonProfile(long id, String personType, String referenceld, String fullName, String email,
            boolean relationshipDeclared, LocalDateTime createdAt) {
        this.id = id;
        this.personType = personType;
        this.referenceld = referenceld;
        this.fullName = fullName;
        this.email = email;
        this.relationshipDeclared = relationshipDeclared;
        this.createdAt = createdAt;
    }
}