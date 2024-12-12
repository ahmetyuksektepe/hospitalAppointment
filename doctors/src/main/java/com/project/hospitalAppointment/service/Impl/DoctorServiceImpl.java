package com.project.hospitalAppointment.service.Impl;

import com.project.hospitalAppointment.data.entity.DoctorEntity;
import com.project.hospitalAppointment.data.model.DoctorDto;
import com.project.hospitalAppointment.data.request.DoctorModel;
import com.project.hospitalAppointment.data.service.DoctorDataService;
import com.project.hospitalAppointment.enums.StatusEnum;
import com.project.hospitalAppointment.mapper.DoctorMapper;
import com.project.hospitalAppointment.service.DoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {
    private final DoctorDataService doctorDataService;
    private final DoctorMapper mapper = DoctorMapper.INSTANCE;

    @Override
    public List<DoctorDto> getAll() {
        List<DoctorEntity> entities = doctorDataService.getAll();
        return entities.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public DoctorDto createDoctor(DoctorModel model) {
        DoctorEntity entity = mapper.toEntity(model);
        entity = doctorDataService.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    public DoctorDto updateDoctor(Long id, DoctorModel model) {
        DoctorEntity entity = doctorDataService.findById(id);
        mapper.toEntity(entity, model);
        entity = doctorDataService.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    public void deleteDoctor(Long id) {
        DoctorEntity entity = doctorDataService.findById(id);
        entity.setStatus(StatusEnum.Terminated);
        doctorDataService.save(entity);
    }


}
