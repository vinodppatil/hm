package com.dtcc.hospital.hm.model;

import com.dtcc.hospital.hm.category.ProgramClassification;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "program")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /*@OneToMany
    private Set<Thing> things;
*/
    private String programName;

    private Date programStartDate;

    private Date programEndDate;

    @Enumerated(value = EnumType.STRING)
    private ProgramClassification programClassification;

    protected Program(){

    }
}
