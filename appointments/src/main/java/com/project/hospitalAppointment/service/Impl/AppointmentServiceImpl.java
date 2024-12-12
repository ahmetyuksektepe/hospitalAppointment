package com.project.hospitalAppointment.service.Impl;

import com.project.hospitalAppointment.data.entity.AppointmentEntity;
import com.project.hospitalAppointment.data.model.AppointmentDto;
import com.project.hospitalAppointment.data.request.AppointmentModel;
import com.project.hospitalAppointment.data.service.AppointmentDataService;
import com.project.hospitalAppointment.enums.StatusEnum;
import com.project.hospitalAppointment.mapper.AppointmentMapper;
import com.project.hospitalAppointment.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentDataService appointmentDataService;
    private final AppointmentMapper mapper = AppointmentMapper.INSTANCE;
    @Override
    public AppointmentDto createAppointment(AppointmentModel model) {
        AppointmentEntity entity = mapper.toEntity(model);
        entity = appointmentDataService.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    public List<AppointmentDto> getAppointments() {
        List<AppointmentEntity> entities = appointmentDataService.findAll();
        return entities.stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public AppointmentDto updateAppointment(Long id ,AppointmentModel model) {
        AppointmentEntity entity = appointmentDataService.findById(id);
        mapper.toEntity(entity, model);
        entity = appointmentDataService.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    public void deleteAppointment(Long id) {
        AppointmentEntity entity = appointmentDataService.findById(id);
        entity.setStatus(StatusEnum.Terminated);
        appointmentDataService.save(entity);
    }
}
