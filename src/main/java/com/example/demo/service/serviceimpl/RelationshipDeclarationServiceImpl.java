package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.repository.RelationshipDeclarationRepository;
import com.example.demo.service.RelationshipDeclarationService;

import java.util.List;
import java.util.stream.Collectors;

public class RelationshipDeclarationServiceImpl
        implements RelationshipDeclarationService {

    private final RelationshipDeclarationRepository repo;
    private final PersonProfileRepository personRepo;

    public RelationshipDeclarationServiceImpl(
            RelationshipDeclarationRepository repo,
            PersonProfileRepository personRepo) {
        this.repo = repo;
        this.personRepo = personRepo;
    }

    @Override
    public RelationshipDeclaration declareRelationship(RelationshipDeclaration d) {
        personRepo.findById(d.getPersonId())
                .orElseThrow(() -> new ApiException("person not found"));
        return repo.save(d);
    }

    @Override
    public List<RelationshipDeclaration> getDeclarationsByPerson(Long personId) {
        return repo.findAll().stream()
                .filter(d -> d.getPersonId().equals(personId))
                .collect(Collectors.toList());
    }

    @Override
    public RelationshipDeclaration verifyDeclaration(Long id, boolean verified) {
        RelationshipDeclaration d = repo.findById(id)
                .orElseThrow(() -> new ApiException("person not found"));
        d.setIsVerified(verified);
        return repo.save(d);
    }

    @Override
    public List<RelationshipDeclaration> getAllDeclarations() {
        return repo.findAll();
    }
}
