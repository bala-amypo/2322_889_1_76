package com.example.demo.service;

import com.example.demo.model.PersonProfile;
import java.util.List;
import java.util.Optional;

public interface PersonProfileService {
    PersonProfile createPerson(PersonProfile person);
    PersonProfile getPersonById(Long id);
    PersonProfile updateRelationshipDeclared(Long id, Boolean declared);
    List<PersonProfile> getAllPersons();
    Optional<PersonProfile> findByReferenceId(String referenceId);
}