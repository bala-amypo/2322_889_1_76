package com.example.demo.service;

import com.example.demo.model.ConflictFlag;
import java.util.List;

public interface ConflictFlagService {
    ConflictFlag addFlag(ConflictFlag flag);
    ConflictFlag getFlagById(Long id);
    List<ConflictFlag> getFlagsByCase(Long caseId);
    List<ConflictFlag> getAllFlags();
}