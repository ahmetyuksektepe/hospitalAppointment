package com.project.hospitalAppointment.data.service.impl;

import com.project.hospitalAppointment.data.entity.DoctorEntity;
import com.project.hospitalAppointment.data.repository.DoctorRepository;
import com.project.hospitalAppointment.data.service.DoctorDataService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Builder
public class DoctorDataServiceImpl implements DoctorDataService {
    private final DoctorRepository doctorRepository;
    @Override
    public List<DoctorEntity> getAll() {
        return doctorRepository.findAll();
    }

    @Override
    public DoctorEntity save(DoctorEntity entity) {
        return doctorRepository.save(entity);
    }

    @Override
    public DoctorEntity findById(Long id) {
        return doctorRepository.findById(id).orElseThrow(() -> new RuntimeException("Doctor not found"));
    }


}