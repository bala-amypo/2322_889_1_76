package com.example.demo.controller;

import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.service.VendorEngagementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/engagements")
public class VendorEngagementController {

    private final VendorEngagementService service;

    public VendorEngagementController(VendorEngagementService service) {
        this.service = service;
    }

    @PostMapping
    public VendorEngagementRecord create(
            @RequestBody VendorEngagementRecord record) {
        return service.addEngagement(record);
    }

    @GetMapping("/employee/{employeeId}")
    public List<VendorEngagementRecord> byEmployee(
            @PathVariable Long employeeId) {
        return service.getEngagementsByEmployee(employeeId);
    }

    @GetMapping("/vendor/{vendorId}")
    public List<VendorEngagementRecord> byVendor(
            @PathVariable Long vendorId) {
        return service.getEngagementsByVendor(vendorId);
    }

    @GetMapping
    public List<VendorEngagementRecord> getAll() {
        return service.getAllEngagements();
    }
}
