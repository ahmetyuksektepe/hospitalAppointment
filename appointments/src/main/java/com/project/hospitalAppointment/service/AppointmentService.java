package com.project.hospitalAppointment.service;

import com.project.hospitalAppointment.data.model.AppointmentDto;
import com.project.hospitalAppointment.data.request.AppointmentModel;

import java.util.List;

public interface AppointmentService {
    AppointmentDto createAppointment(AppointmentModel model);

    List<AppointmentDto> getAppointments();

    AppointmentDto updateAppointment(Long id ,AppointmentModel model);

    void deleteAppointment(Long id);
}
