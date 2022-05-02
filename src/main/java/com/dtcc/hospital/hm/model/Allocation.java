package com.dtcc.hospital.hm.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Allocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int thingId;
    private int  programId;
}
