package com.example.demo.repository;

import com.example.demo.model.PersonProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonProfileRepository extends JpaRepository<PersonProfile, Long> {
    Optional<PersonProfile> findByEmail(String email);
    Optional<PersonProfile> findByReferenceId(String referenceId);
}
