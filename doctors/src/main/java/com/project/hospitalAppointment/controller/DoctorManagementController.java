package com.project.hospitalAppointment.controller;

import com.project.hospitalAppointment.data.model.DoctorDto;
import com.project.hospitalAppointment.data.request.DoctorModel;
import com.project.hospitalAppointment.service.DoctorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/doctor")
@Slf4j
@RestController
@AllArgsConstructor
public class DoctorManagementController {
    private final DoctorService doctorService;

    @GetMapping
    public List<DoctorDto> getAll() {
        return doctorService.getAll();
    }

    @PostMapping
    public DoctorDto createDoctor(@RequestBody DoctorModel model) {
        return doctorService.createDoctor(model);
    }

    @PutMapping("/{id}")
    public DoctorDto updateDoctor(@PathVariable("id") Long id, @RequestBody DoctorModel model) {
        return doctorService.updateDoctor(id, model);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable("id") Long id) {
        doctorService.deleteDoctor(id);
    }

}
