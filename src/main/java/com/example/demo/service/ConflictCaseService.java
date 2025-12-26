package com.example.demo.service;

import com.example.demo.model.ConflictCase;
import java.util.List;
import java.util.Optional;

public interface ConflictCaseService {
    ConflictCase createCase(ConflictCase conflictCase);
    ConflictCase updateCaseStatus(Long id, String status);
    List<ConflictCase> getCasesByPerson(Long personId);
    List<ConflictCase> getAllCases();
    Optional<ConflictCase> getCaseById(Long id);
}