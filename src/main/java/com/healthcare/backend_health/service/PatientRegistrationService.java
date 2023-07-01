package com.healthcare.backend_health.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.healthcare.backend_health.dao.PatientRepository;
import com.healthcare.backend_health.dto.PatientEntityDTO;
import com.healthcare.backend_health.entity.PatientEntity;

import lombok.Data;

@Service
@Data
public class PatientRegistrationService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncoder encoder;

    public void createPatient(PatientEntityDTO patientEntityDTO) {

        PatientEntity patientEntity = modelMapper.map(patientEntityDTO, PatientEntity.class);
        patientEntity.getAuthUser().setPassword(encoder.encode(patientEntity.getAuthUser().getPassword()));
        patientRepository.save(patientEntity);

    }

}
