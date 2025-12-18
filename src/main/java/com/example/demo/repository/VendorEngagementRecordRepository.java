package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.PersonProfile;
public interface VendorEngagementRepository extends JpaRepository<PersonProfile,Long>{

    
}