package com.healthcare.backend_health.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.backend_health.entity.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

}
