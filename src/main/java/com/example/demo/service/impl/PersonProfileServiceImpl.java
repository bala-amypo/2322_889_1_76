package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.PersonProfile;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.service.PersonProfileService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonProfileServiceImpl implements PersonProfileService {
    private final PersonProfileRepository personRepo;

    public PersonProfileServiceImpl(PersonProfileRepository personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public PersonProfile createPerson(PersonProfile person) {
        if (person.getEmail() == null || person.getEmail().trim().isEmpty()) {
            throw new ApiException("Email is required");
        }
        if (personRepo.findByEmail(person.getEmail()).isPresent()) {
            throw new ApiException("Email already exists");
        }
        if (person.getReferenceId() != null && personRepo.findByReferenceId(person.getReferenceId()).isPresent()) {
            throw new ApiException("Reference ID already exists");
        }
        return personRepo.save(person);
    }

    @Override
    public PersonProfile getPersonById(Long id) {
        return personRepo.findById(id)
                .orElseThrow(() -> new ApiException("Person not found"));
    }

    @Override
    public PersonProfile updateRelationshipDeclared(Long id, Boolean declared) {
        PersonProfile person = getPersonById(id);
        person.setRelationshipDeclared(declared);
        return personRepo.save(person);
    }

    @Override
    public List<PersonProfile> getAllPersons() {
        return personRepo.findAll();
    }

    @Override
    public Optional<PersonProfile> findByReferenceId(String referenceId) {
        return personRepo.findByReferenceId(referenceId);
    }
}