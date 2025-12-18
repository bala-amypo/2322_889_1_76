package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.ConflictCase;
public interface ConflictCaseRepository extends JpaRepository<ConflictCase,Long>{

    
}