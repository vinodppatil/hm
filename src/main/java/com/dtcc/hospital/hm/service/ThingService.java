package com.dtcc.hospital.hm.service;

import com.dtcc.hospital.hm.model.Thing;
import com.dtcc.hospital.hm.model.repo.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ThingService {
    @Autowired
    public ThingRepository thingRepository;

    public Thing register(Thing thing){
            return this.thingRepository.save(thing);
    }

    public List<Thing> findAll() {
        return (ArrayList<Thing>) this.thingRepository.findAll();
    }

    public List<Thing> findHumans() {
        return (ArrayList<Thing>) this.thingRepository.findByLivingType(Boolean.TRUE);
    }

    public List<Thing> findItems() {
        return (ArrayList<Thing>) this.thingRepository.findByLivingType(Boolean.FALSE);
    }

    public boolean removeThing(Integer id) {
        this.thingRepository.deleteById(id);
        return Boolean.TRUE;
    }

    public Optional<Thing> findById(int id) {
        return this.thingRepository.findById(id);
    }
}
