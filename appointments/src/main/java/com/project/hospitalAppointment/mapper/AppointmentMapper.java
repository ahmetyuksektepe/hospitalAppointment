package com.project.hospitalAppointment.mapper;

import com.project.hospitalAppointment.data.entity.AppointmentEntity;
import com.project.hospitalAppointment.data.model.AppointmentDto;
import com.project.hospitalAppointment.data.request.AppointmentModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AppointmentMapper {
    AppointmentMapper INSTANCE = Mappers.getMapper(AppointmentMapper.class);

    void toEntity(@MappingTarget AppointmentEntity entity, AppointmentModel model);
    AppointmentDto toDto(AppointmentEntity entity);
    AppointmentEntity toEntity(AppointmentModel model);
}
