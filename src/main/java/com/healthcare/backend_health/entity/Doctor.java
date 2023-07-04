package com.healthcare.backend_health.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Doctor {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String email;
    String address;
}
