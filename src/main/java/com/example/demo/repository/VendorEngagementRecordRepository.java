package com.example.demo.repository;

import com.example.demo.model.VendorEngagementRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendorEngagementRecordRepository
        extends JpaRepository<VendorEngagementRecord, Long> {

    List<VendorEngagementRecord> findByEmployeeId(Long employeeId);
    List<VendorEngagementRecord> findByVendorId(Long vendorId);
}
