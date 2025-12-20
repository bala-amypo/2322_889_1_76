package com.example.demo.repository;

import com.example.demo.model.RelationshipDeclaration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelationshipDeclarationRepository
        extends JpaRepository<RelationshipDeclaration, Long> {
}
