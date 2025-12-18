package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.RelationshipDeclaration;
public interface RelationshipDeclarationRepository extends JpaRepository<RelationshipDeclaration,Long>{

    
}