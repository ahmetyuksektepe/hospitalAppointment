package com.project.hospitalAppointment.controller;

import com.project.hospitalAppointment.data.model.AppointmentDto;
import com.project.hospitalAppointment.data.request.AppointmentModel;
import com.project.hospitalAppointment.service.AppointmentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/appointment")
@Slf4j
@RestController
@AllArgsConstructor
public class AppointmentManagementController {
    private final AppointmentService service;

    @GetMapping
    public List<AppointmentDto> getAppointments() {
        return service.getAppointments();
    }

    @PostMapping
    public AppointmentDto createAppointment(@RequestBody AppointmentModel model) {
        return service.createAppointment(model);
    }

    @PutMapping("/{id}")
    public AppointmentDto updateAppointment(@PathVariable("id") Long id, @RequestBody AppointmentModel model) {
        return service.updateAppointment(id, model);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable("id") Long id) {
        service.deleteAppointment(id);
    }
}
