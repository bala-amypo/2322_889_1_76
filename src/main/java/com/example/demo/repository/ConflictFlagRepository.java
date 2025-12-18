package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.ConflictFlag;
public interface ConflictFlag extends JpaRepository<ConflictFlag,Long>{

    
}