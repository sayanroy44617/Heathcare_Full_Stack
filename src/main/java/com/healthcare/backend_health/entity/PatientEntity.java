package com.healthcare.backend_health.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "patient")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Integer phnno;
    private String address;
    private String medicalHistory;
    private Integer age;
    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    private AuthUser authUser;

}
