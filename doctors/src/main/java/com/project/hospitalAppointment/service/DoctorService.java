package com.project.hospitalAppointment.service;

import com.project.hospitalAppointment.data.model.DoctorDto;
import com.project.hospitalAppointment.data.request.DoctorModel;

import java.util.List;

public interface DoctorService {
    List<DoctorDto> getAll();

    DoctorDto createDoctor(DoctorModel model);

    DoctorDto updateDoctor(Long id, DoctorModel model);

    void deleteDoctor(Long id);
}
