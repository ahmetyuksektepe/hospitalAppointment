package com.project.hospitalAppointment.data.service;

import com.project.hospitalAppointment.data.entity.DoctorEntity;
import com.project.hospitalAppointment.data.request.DoctorModel;

import java.util.List;

public interface DoctorDataService {
    List<DoctorEntity> getAll();

    DoctorEntity save(DoctorEntity entity);

    DoctorEntity findById(Long id);
}
