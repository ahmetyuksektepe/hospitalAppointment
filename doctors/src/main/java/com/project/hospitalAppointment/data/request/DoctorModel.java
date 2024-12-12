package com.project.hospitalAppointment.data.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorModel {
    private String name;
    private int workHours;
    private String surname;
    private String department;
}
