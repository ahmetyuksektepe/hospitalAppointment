package com.project.hospitalAppointment.data.model;

import com.project.hospitalAppointment.enums.StatusEnum;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
    private Long id;
    private String name;
    private StatusEnum status = StatusEnum.Active;
    private String surname;
    private String department;
    private int workHours;
}
