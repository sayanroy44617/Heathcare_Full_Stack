package com.healthcare.backend_health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.backend_health.dto.PatientEntityDTO;
import com.healthcare.backend_health.service.PatientRegistrationService;

@RestController
@RequestMapping("/health/patient")
public class PatientRegistrationController {

    @Autowired
    private PatientRegistrationService patientRegistrationService;

    @GetMapping("/")
    public String getreq() {
        return "hei";
    }

    @PostMapping("/registration")
    public ResponseEntity<?> patientController(@RequestBody PatientEntityDTO patientEntityDTO) {

        patientRegistrationService.createPatient(patientEntityDTO);

        return ResponseEntity.ok("Patient Created Succesfully");
    }

    @GetMapping("/registration")
    public ResponseEntity<?> patientControlle() {

        return ResponseEntity.ok("Patient Created Succesfully");
    }

}
