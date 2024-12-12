package com.project.hospitalAppointment.data.entity;

import com.project.hospitalAppointment.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "doctors")
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private StatusEnum status = StatusEnum.Active;
    private String name;
    private int workHours;
    private String surname;
    private String department;
}
