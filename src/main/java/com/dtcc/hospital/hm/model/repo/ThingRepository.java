package com.dtcc.hospital.hm.model.repo;

import com.dtcc.hospital.hm.model.Thing;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ThingRepository extends CrudRepository<Thing, Integer> {


    List<Thing> findByLivingType(Boolean value);
}
