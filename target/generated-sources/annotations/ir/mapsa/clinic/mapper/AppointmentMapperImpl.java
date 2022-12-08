package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.dto.AppointmentDto;
import ir.mapsa.clinic.entity.AppointmentEntity;
import ir.mapsa.clinic.entity.AppointmentEntity.AppointmentEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-08T10:31:31+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class AppointmentMapperImpl implements AppointmentMapper {

    @Override
    public AppointmentEntity convertDtoToEntity(AppointmentDto d) {
        if ( d == null ) {
            return null;
        }

        AppointmentEntityBuilder appointmentEntity = AppointmentEntity.builder();

        appointmentEntity.id( d.getId() );
        appointmentEntity.status( d.isStatus() );
        appointmentEntity.patient( d.getPatient() );

        return appointmentEntity.build();
    }

    @Override
    public AppointmentDto convertEntityToDto(AppointmentEntity t) {
        if ( t == null ) {
            return null;
        }

        AppointmentDto appointmentDto = new AppointmentDto();

        appointmentDto.setCreatedDate( t.getCreatedDate() );
        appointmentDto.setLastModifiedDate( t.getLastModifiedDate() );
        appointmentDto.setId( t.getId() );
        appointmentDto.setStatus( t.isStatus() );
        appointmentDto.setPatient( t.getPatient() );

        return appointmentDto;
    }

    @Override
    public List<AppointmentEntity> convertListDtoToListEntity(List<AppointmentDto> dList) {
        if ( dList == null ) {
            return null;
        }

        List<AppointmentEntity> list = new ArrayList<AppointmentEntity>( dList.size() );
        for ( AppointmentDto appointmentDto : dList ) {
            list.add( convertDtoToEntity( appointmentDto ) );
        }

        return list;
    }

    @Override
    public List<AppointmentDto> convertListEntityToListDto(List<AppointmentEntity> tList) {
        if ( tList == null ) {
            return null;
        }

        List<AppointmentDto> list = new ArrayList<AppointmentDto>( tList.size() );
        for ( AppointmentEntity appointmentEntity : tList ) {
            list.add( convertEntityToDto( appointmentEntity ) );
        }

        return list;
    }
}
