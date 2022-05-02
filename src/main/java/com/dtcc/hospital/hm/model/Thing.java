package com.dtcc.hospital.hm.model;

import com.dtcc.hospital.hm.category.StaffType;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Thing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Enumerated(EnumType.STRING)
    private StaffType staffType;

    private Boolean livingType;

    private String location;

    private Boolean criticality;

    /*@ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Program program;*/

    protected Thing() {

    }
}
;