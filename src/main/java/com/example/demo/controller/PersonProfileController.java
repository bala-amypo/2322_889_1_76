package com.example.demo.controller;

import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonProfileController {

    private final PersonProfileService service;

    public PersonProfileController(PersonProfileService service) {
        this.service = service;
    }

    @PostMapping
    public PersonProfile create(@RequestBody PersonProfile person) {
        return service.createPerson(person);
    }

    @GetMapping("/{id}")
    public PersonProfile getById(@PathVariable Long id) {
        return service.getPersonById(id);
    }

    @GetMapping
    public List<PersonProfile> getAll() {
        return service.getAllPersons();
    }

    @GetMapping("/reference/{referenceId}")
    public PersonProfile getByReference(@PathVariable String referenceId) {
        return service.findByReferenceId(referenceId);
    }

    @PutMapping("/{id}/relationship")
    public PersonProfile updateRelationship(
            @PathVariable Long id,
            @RequestParam boolean declared) {
        return service.updateRelationshipDeclared(id, declared);
    }
}
