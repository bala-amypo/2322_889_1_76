package com.example.demo.service;

import com.example.demo.model.ConflictFlag;
import java.util.List;

public interface ConflictFlagService {
    ConflictFlag addFlag(ConflictFlag flag);
    List<ConflictFlag> getFlagsByCase(Long caseId);
    ConflictFlag getFlagById(Long id);
    List<ConflictFlag> getAllFlags();
}
