package com.project.hospitalAppointment.data.service;

import com.project.hospitalAppointment.data.entity.AppointmentEntity;
import com.project.hospitalAppointment.data.model.AppointmentDto;

import java.util.List;

public interface AppointmentDataService {
    AppointmentEntity save(AppointmentEntity entity);

    List<AppointmentEntity> findAll();

    AppointmentEntity findById(Long id);
}
