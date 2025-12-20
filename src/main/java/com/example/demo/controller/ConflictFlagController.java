package com.example.demo.controller;

import com.example.demo.model.ConflictFlag;
import com.example.demo.service.ConflictFlagService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conflict-flags")
public class ConflictFlagController {

    private final ConflictFlagService service;

    public ConflictFlagController(ConflictFlagService service) {
        this.service = service;
    }

    @PostMapping
    public ConflictFlag add(@RequestBody ConflictFlag flag) {
        return service.addFlag(flag);
    }

    @GetMapping("/case/{caseId}")
    public List<ConflictFlag> byCase(@PathVariable Long caseId) {
        return service.getFlagsByCase(caseId);
    }

    @GetMapping("/{id}")
    public ConflictFlag getById(@PathVariable Long id) {
        return service.getFlagById(id);
    }

    @GetMapping
    public List<ConflictFlag> getAll() {
        return service.getAllFlags();
    }
}
