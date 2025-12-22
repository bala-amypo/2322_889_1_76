// package com.example.demo.service.impl;

// import com.example.demo.exception.ApiException;
// import com.example.demo.model.ConflictCase;
// import com.example.demo.repository.ConflictCaseRepository;
// import com.example.demo.repository.ConflictFlagRepository;
// import com.example.demo.service.ConflictCaseService;

// import java.util.List;

// public class ConflictCaseServiceImpl implements ConflictCaseService {

//     private final ConflictCaseRepository repo;
//     private final ConflictFlagRepository flagRepo;

//     public ConflictCaseServiceImpl(
//             ConflictCaseRepository repo,
//             ConflictFlagRepository flagRepo) {
//         this.repo = repo;
//         this.flagRepo = flagRepo;
//     }

//     @Override
//     public ConflictCase createCase(ConflictCase c) {
//         return repo.save(c);
//     }

//     @Override
//     public ConflictCase updateCaseStatus(Long id, String status) {
//         ConflictCase c = getCaseById(id);
//         c.setStatus(status);
//         return repo.save(c);
//     }

//     @Override
//     public List<ConflictCase> getCasesByPerson(Long id) {
//         return repo.findByPrimaryPersonIdOrSecondaryPersonId(id, id);
//     }

//     @Override
//     public ConflictCase getCaseById(Long id) {
//         return repo.findById(id)
//                 .orElseThrow(() -> new ApiException("case not found"));
//     }

//     @Override
//     public List<ConflictCase> getAllCases() {
//         return repo.findAll();
//     }
// }



package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.ConflictCase;
import com.example.demo.repository.ConflictCaseRepository;
import com.example.demo.repository.ConflictFlagRepository;
import com.example.demo.service.ConflictCaseService;

import java.util.List;
import org.springframework.stereotype.Service;   

@Service  
public class ConflictCaseServiceImpl implements ConflictCaseService {

    private final ConflictCaseRepository repo;
    private final ConflictFlagRepository flagRepo;

    public ConflictCaseServiceImpl(
            ConflictCaseRepository repo,
            ConflictFlagRepository flagRepo) {
        this.repo = repo;
        this.flagRepo = flagRepo;
    }

    @Override
    public ConflictCase createCase(ConflictCase c) {
        return repo.save(c);
    }

    @Override
    public ConflictCase updateCaseStatus(Long id, String status) {
        ConflictCase c = getCaseById(id);
        c.setStatus(status);
        return repo.save(c);
    }

    @Override
    public List<ConflictCase> getCasesByPerson(Long id) {
        return repo.findByPrimaryPersonIdOrSecondaryPersonId(id, id);
    }

    @Override
    public ConflictCase getCaseById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ApiException("case not found"));
    }

    @Override
    public List<ConflictCase> getAllCases() {
        return repo.findAll();
    }
}
