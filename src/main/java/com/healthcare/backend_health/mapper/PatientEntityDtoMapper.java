package com.healthcare.backend_health.mapper;

 import org.mapstruct.Mapper;

import com.healthcare.backend_health.dto.PatientEntityDTO;
import com.healthcare.backend_health.entity.PatientEntity;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface PatientEntityDtoMapper {

     PatientEntity dtoToEntity(PatientEntityDTO patientEntityDTO);

     PatientEntityDTO entityToDto(PatientEntity patientEntity);

}
