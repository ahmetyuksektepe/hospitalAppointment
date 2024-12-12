package com.project.hospitalAppointment.mapper;

import com.project.hospitalAppointment.data.entity.DoctorEntity;
import com.project.hospitalAppointment.data.model.DoctorDto;
import com.project.hospitalAppointment.data.request.DoctorModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    DoctorEntity toEntity(DoctorModel model);
    DoctorDto toDto(DoctorEntity entity);

    void toEntity(@MappingTarget DoctorEntity entity, DoctorModel model);
}
