package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.VendorEngagementRecord;
public interface VendorEngagementRecordRepository extends JpaRepository<VendorEngagementRecord,Long>{

    
}