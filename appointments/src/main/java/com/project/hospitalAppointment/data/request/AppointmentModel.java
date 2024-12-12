package com.project.hospitalAppointment.data.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentModel {
    private Long doctorId;
    private String name;
    private String surname;
}
