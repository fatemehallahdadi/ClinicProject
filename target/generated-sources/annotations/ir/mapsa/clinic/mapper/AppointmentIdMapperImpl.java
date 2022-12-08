package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.dto.AppointmentIdDto;
import ir.mapsa.clinic.entity.AppointmentEntity;
import ir.mapsa.clinic.entity.AppointmentEntity.AppointmentEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-08T10:31:33+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class AppointmentIdMapperImpl implements AppointmentIdMapper {

    @Override
    public AppointmentEntity convertDtoToEntity(AppointmentIdDto d) {
        if ( d == null ) {
            return null;
        }

        AppointmentEntityBuilder appointmentEntity = AppointmentEntity.builder();

        appointmentEntity.id( d.getId() );
        appointmentEntity.status( d.isStatus() );

        return appointmentEntity.build();
    }

    @Override
    public AppointmentIdDto convertEntityToDto(AppointmentEntity t) {
        if ( t == null ) {
            return null;
        }

        AppointmentIdDto appointmentIdDto = new AppointmentIdDto();

        appointmentIdDto.setCreatedDate( t.getCreatedDate() );
        appointmentIdDto.setLastModifiedDate( t.getLastModifiedDate() );
        appointmentIdDto.setId( t.getId() );
        appointmentIdDto.setStatus( t.isStatus() );

        return appointmentIdDto;
    }

    @Override
    public List<AppointmentEntity> convertListDtoToListEntity(List<AppointmentIdDto> dList) {
        if ( dList == null ) {
            return null;
        }

        List<AppointmentEntity> list = new ArrayList<AppointmentEntity>( dList.size() );
        for ( AppointmentIdDto appointmentIdDto : dList ) {
            list.add( convertDtoToEntity( appointmentIdDto ) );
        }

        return list;
    }

    @Override
    public List<AppointmentIdDto> convertListEntityToListDto(List<AppointmentEntity> tList) {
        if ( tList == null ) {
            return null;
        }

        List<AppointmentIdDto> list = new ArrayList<AppointmentIdDto>( tList.size() );
        for ( AppointmentEntity appointmentEntity : tList ) {
            list.add( convertEntityToDto( appointmentEntity ) );
        }

        return list;
    }
}
