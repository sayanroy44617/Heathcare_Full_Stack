package com.healthcare.backend_health.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class DoctorsAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne(cascade = CascadeType.ALL)
    Doctor doctor;
    Instant date;
    boolean status;
}
