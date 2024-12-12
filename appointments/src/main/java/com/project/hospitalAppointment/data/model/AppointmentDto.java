package com.project.hospitalAppointment.data.model;

import com.project.hospitalAppointment.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto {
    private Long id;
    private StatusEnum status = StatusEnum.Active;
    private Long doctorId;
    private String name;
    private String surname;
}
