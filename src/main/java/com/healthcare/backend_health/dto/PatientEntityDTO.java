package com.healthcare.backend_health.dto;

import org.springframework.stereotype.Component;

import com.healthcare.backend_health.entity.AuthUser;

import lombok.Data;

@Component
@Data
public class PatientEntityDTO {

    private long id;

    private String name;
    private Integer phnno;
    private String address;
    private String medicalHistory;
    private Integer age;
    private String gender;

    private AuthUser authUser;

}
