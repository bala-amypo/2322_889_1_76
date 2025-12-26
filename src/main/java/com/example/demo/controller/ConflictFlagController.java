package com.example.demo.controller;

import com.example.demo.model.ConflictFlag;
import com.example.demo.service.ConflictFlagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flags")
public class ConflictFlagController {
    private final ConflictFlagService service;

    public ConflictFlagController(ConflictFlagService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ConflictFlag> create(@RequestBody ConflictFlag flag) {
        return ResponseEntity.ok(service.addFlag(flag));
    }

    @GetMapping
    public ResponseEntity<List<ConflictFlag>> getAll() {
        return ResponseEntity.ok(service.getAllFlags());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConflictFlag> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getFlagById(id));
    }

    @GetMapping("/case/{caseId}")
    public ResponseEntity<List<ConflictFlag>> getByCase(@PathVariable Long caseId) {
        return ResponseEntity.ok(service.getFlagsByCase(caseId));
    }
}