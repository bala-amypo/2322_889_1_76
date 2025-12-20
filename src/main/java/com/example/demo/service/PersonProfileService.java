package com.example.demo.service;

import com.example.demo.model.PersonProfile;
import java.util.List;

public interface PersonProfileService {
    PersonProfile createPerson(PersonProfile person);
    PersonProfile getPersonById(Long id);
    List<PersonProfile> getAllPersons();
    PersonProfile findByReferenceId(String referenceId);
    PersonProfile updateRelationshipDeclared(Long id, boolean declared);
}
