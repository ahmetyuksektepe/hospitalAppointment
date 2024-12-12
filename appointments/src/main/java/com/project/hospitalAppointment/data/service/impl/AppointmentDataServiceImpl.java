package com.project.hospitalAppointment.data.service.impl;

import com.project.hospitalAppointment.data.entity.AppointmentEntity;
import com.project.hospitalAppointment.data.model.AppointmentDto;
import com.project.hospitalAppointment.data.repository.AppointmentRepository;
import com.project.hospitalAppointment.data.service.AppointmentDataService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Builder
public class AppointmentDataServiceImpl implements AppointmentDataService {
    private final AppointmentRepository repository;
    @Override
    public AppointmentEntity save(AppointmentEntity entity) {
        return repository.save(entity);
    }

    @Override
    public List<AppointmentEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public AppointmentEntity findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Appointment not found"));
    }
}
