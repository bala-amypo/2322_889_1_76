package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.PersonProfile;
import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.repository.RelationshipDeclarationRepository;
import com.example.demo.service.RelationshipDeclarationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipDeclarationServiceImpl implements RelationshipDeclarationService {
    private final RelationshipDeclarationRepository relationshipRepo;
    private final PersonProfileRepository personRepo;

    public RelationshipDeclarationServiceImpl(RelationshipDeclarationRepository relationshipRepo, PersonProfileRepository personRepo) {
        this.relationshipRepo = relationshipRepo;
        this.personRepo = personRepo;
    }

    @Override
    public RelationshipDeclaration declareRelationship(RelationshipDeclaration declaration) {
        PersonProfile person = personRepo.findById(declaration.getPersonId())
                .orElseThrow(() -> new ApiException("Person not found"));
        
        RelationshipDeclaration saved = relationshipRepo.save(declaration);
        
        person.setRelationshipDeclared(true);
        personRepo.save(person);
        
        return saved;
    }

    @Override
    public RelationshipDeclaration verifyDeclaration(Long id, Boolean verified) {
        RelationshipDeclaration declaration = relationshipRepo.findById(id)
                .orElseThrow(() -> new ApiException("Declaration not found"));
        declaration.setIsVerified(verified);
        return relationshipRepo.save(declaration);
    }

    @Override
    public List<RelationshipDeclaration> getAllDeclarations() {
        return relationshipRepo.findAll();
    }

    @Override
    public List<RelationshipDeclaration> getDeclarationsByPerson(Long personId) {
        return relationshipRepo.findByPersonId(personId);
    }
}