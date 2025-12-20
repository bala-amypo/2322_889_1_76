package com.example.demo.repository;

import com.example.demo.model.ConflictFlag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConflictFlagRepository
        extends JpaRepository<ConflictFlag, Long> {

    List<ConflictFlag> findByCaseId(Long caseId);
}
