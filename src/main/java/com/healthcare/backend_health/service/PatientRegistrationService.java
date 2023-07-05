package com.healthcare.backend_health.service;

import com.healthcare.backend_health.mapper.PatientEntityDtoMapper;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class PatientRegistrationService {

    private PatientRepository patientRepository;
    private PatientEntityDtoMapper patientEntityDtoMapper;
    private PasswordEncoder encoder;

    public void createPatient(PatientEntityDTO patientEntityDTO) {

        PatientEntity patientEntity = patientEntityDtoMapper.dtoToEntity(patientEntityDTO);
        patientEntity.getAuthUser().setPassword(encoder.encode(patientEntity.getAuthUser().getPassword()));
        patientRepository.save(patientEntity);

    }

}
