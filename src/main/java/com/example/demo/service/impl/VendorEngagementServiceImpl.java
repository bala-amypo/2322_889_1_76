package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.repository.VendorEngagementRecordRepository;
import com.example.demo.service.VendorEngagementService;

import java.util.List;
import org.springframework.stereotype.Service;   
@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {

    private final VendorEngagementRecordRepository repo;
    private final PersonProfileRepository personRepo;

    public VendorEngagementServiceImpl(
            VendorEngagementRecordRepository repo,
            PersonProfileRepository personRepo) {
        this.repo = repo;
        this.personRepo = personRepo;
    }

    @Override
    public VendorEngagementRecord addEngagement(VendorEngagementRecord r) {
        personRepo.findById(r.getEmployeeId())
                .orElseThrow(() -> new ApiException("person not found"));
        personRepo.findById(r.getVendorId())
                .orElseThrow(() -> new ApiException("person not found"));
        return repo.save(r);
    }

    @Override
    public List<VendorEngagementRecord> getEngagementsByEmployee(Long id) {
        return repo.findByEmployeeId(id);
    }

    @Override
    public List<VendorEngagementRecord> getEngagementsByVendor(Long id) {
        return repo.findByVendorId(id);
    }

    @Override
    public List<VendorEngagementRecord> getAllEngagements() {
        return repo.findAll();
    }
}
