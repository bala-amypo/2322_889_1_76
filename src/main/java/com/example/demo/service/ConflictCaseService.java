package com.example.demo.service;

import com.example.demo.model.ConflictCase;
import java.util.List;

public interface ConflictCaseService {
    ConflictCase createCase(ConflictCase conflictCase);
    ConflictCase updateCaseStatus(Long caseId, String status);
    List<ConflictCase> getCasesByPerson(Long personId);
    ConflictCase getCaseById(Long id);
    List<ConflictCase> getAllCases();
}
