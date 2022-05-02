package com.dtcc.hospital.hm.service;

import com.dtcc.hospital.hm.model.ItemDTO;
import com.dtcc.hospital.hm.model.Program;
import com.dtcc.hospital.hm.model.Thing;
import com.dtcc.hospital.hm.model.repo.AllocationRepository;
import com.dtcc.hospital.hm.model.repo.ProgramRepository;
import com.dtcc.hospital.hm.model.repo.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {
    @Autowired
    ProgramRepository programRepository;

    @Autowired
    AllocationRepository allocationRepository;

    @Autowired
    ThingRepository thingRepository;

    public Program register(Program program) {
        return programRepository.save(program);
    }

    public List<Program> findAll() {
        return (List<Program>) programRepository.findAll();
    }

   /* public List<ItemDTO> collectItesm(){
        List<Program> programs = findAll();
        List<Thing> things = (List<Thing>) thingRepository.findAll();
    }*/
}
