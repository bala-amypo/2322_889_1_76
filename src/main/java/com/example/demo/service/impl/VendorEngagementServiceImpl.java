package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.repository.VendorEngagementRecordRepository;
import com.example.demo.service.VendorEngagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {
    private final VendorEngagementRecordRepository engagementRepo;
    private final PersonProfileRepository personRepo;

    public VendorEngagementServiceImpl(VendorEngagementRecordRepository engagementRepo, PersonProfileRepository personRepo) {
        this.engagementRepo = engagementRepo;
        this.personRepo = personRepo;
    }

    @Override
    public VendorEngagementRecord addEngagement(VendorEngagementRecord record) {
        if (record.getEmployeeId() != null && !personRepo.findById(record.getEmployeeId()).isPresent()) {
            throw new ApiException("Employee not found");
        }
        if (record.getVendorId() != null && !personRepo.findById(record.getVendorId()).isPresent()) {
            throw new ApiException("Vendor not found");
        }
        return engagementRepo.save(record);
    }

    @Override
    public List<VendorEngagementRecord> getEngagementsByEmployee(Long employeeId) {
        return engagementRepo.findByEmployeeId(employeeId);
    }

    @Override
    public List<VendorEngagementRecord> getEngagementsByVendor(Long vendorId) {
        return engagementRepo.findByVendorId(vendorId);
    }

    @Override
    public List<VendorEngagementRecord> getAllEngagements() {
        return engagementRepo.findAll();
    }
}