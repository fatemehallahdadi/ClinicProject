package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.dto.ScheduleDto;
import ir.mapsa.clinic.entity.ScheduleEntity;
import ir.mapsa.clinic.entity.ScheduleEntity.ScheduleEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-08T10:31:32+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class ScheduleMapperImpl implements ScheduleMapper {

    @Override
    public ScheduleEntity convertDtoToEntity(ScheduleDto d) {
        if ( d == null ) {
            return null;
        }

        ScheduleEntityBuilder scheduleEntity = ScheduleEntity.builder();

        scheduleEntity.id( d.getId() );
        scheduleEntity.date( d.getDate() );
        scheduleEntity.startDate( d.getStartDate() );
        scheduleEntity.endDate( d.getEndDate() );
        scheduleEntity.patient( d.getPatient() );
        scheduleEntity.employee( d.getEmployee() );

        return scheduleEntity.build();
    }

    @Override
    public ScheduleDto convertEntityToDto(ScheduleEntity t) {
        if ( t == null ) {
            return null;
        }

        ScheduleDto scheduleDto = new ScheduleDto();

        scheduleDto.setCreatedDate( t.getCreatedDate() );
        scheduleDto.setLastModifiedDate( t.getLastModifiedDate() );
        scheduleDto.setId( t.getId() );
        scheduleDto.setDate( t.getDate() );
        scheduleDto.setStartDate( t.getStartDate() );
        scheduleDto.setEndDate( t.getEndDate() );
        scheduleDto.setPatient( t.getPatient() );
        scheduleDto.setEmployee( t.getEmployee() );

        return scheduleDto;
    }

    @Override
    public List<ScheduleEntity> convertListDtoToListEntity(List<ScheduleDto> dList) {
        if ( dList == null ) {
            return null;
        }

        List<ScheduleEntity> list = new ArrayList<ScheduleEntity>( dList.size() );
        for ( ScheduleDto scheduleDto : dList ) {
            list.add( convertDtoToEntity( scheduleDto ) );
        }

        return list;
    }

    @Override
    public List<ScheduleDto> convertListEntityToListDto(List<ScheduleEntity> tList) {
        if ( tList == null ) {
            return null;
        }

        List<ScheduleDto> list = new ArrayList<ScheduleDto>( tList.size() );
        for ( ScheduleEntity scheduleEntity : tList ) {
            list.add( convertEntityToDto( scheduleEntity ) );
        }

        return list;
    }
}
