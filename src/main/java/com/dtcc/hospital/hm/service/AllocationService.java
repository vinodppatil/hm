package com.dtcc.hospital.hm.service;

import com.dtcc.hospital.hm.model.Allocation;
import com.dtcc.hospital.hm.model.Thing;
import com.dtcc.hospital.hm.model.repo.AllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllocationService {
    @Autowired
    AllocationRepository allocationRepository;


    public boolean removeAllocation(Integer id) {
        allocationRepository.deleteById(id);
        return Boolean.TRUE;
    }

    public Allocation register(Allocation allocation) {
        return allocationRepository.save(allocation);

    }

    public List<Allocation> findAll() {
        return (List<Allocation>) allocationRepository.findAll();
    }
}
