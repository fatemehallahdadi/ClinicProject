package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.dto.ScheduleIdDto;
import ir.mapsa.clinic.entity.ScheduleEntity;
import ir.mapsa.clinic.entity.ScheduleEntity.ScheduleEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-08T10:31:29+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class ScheduleIdMapperImpl implements ScheduleIdMapper {

    @Override
    public ScheduleEntity convertDtoToEntity(ScheduleIdDto d) {
        if ( d == null ) {
            return null;
        }

        ScheduleEntityBuilder scheduleEntity = ScheduleEntity.builder();

        scheduleEntity.id( d.getId() );
        scheduleEntity.date( d.getDate() );
        scheduleEntity.startDate( d.getStartDate() );
        scheduleEntity.endDate( d.getEndDate() );

        return scheduleEntity.build();
    }

    @Override
    public ScheduleIdDto convertEntityToDto(ScheduleEntity t) {
        if ( t == null ) {
            return null;
        }

        ScheduleIdDto scheduleIdDto = new ScheduleIdDto();

        scheduleIdDto.setCreatedDate( t.getCreatedDate() );
        scheduleIdDto.setLastModifiedDate( t.getLastModifiedDate() );
        scheduleIdDto.setId( t.getId() );
        scheduleIdDto.setDate( t.getDate() );
        scheduleIdDto.setStartDate( t.getStartDate() );
        scheduleIdDto.setEndDate( t.getEndDate() );

        return scheduleIdDto;
    }

    @Override
    public List<ScheduleEntity> convertListDtoToListEntity(List<ScheduleIdDto> dList) {
        if ( dList == null ) {
            return null;
        }

        List<ScheduleEntity> list = new ArrayList<ScheduleEntity>( dList.size() );
        for ( ScheduleIdDto scheduleIdDto : dList ) {
            list.add( convertDtoToEntity( scheduleIdDto ) );
        }

        return list;
    }

    @Override
    public List<ScheduleIdDto> convertListEntityToListDto(List<ScheduleEntity> tList) {
        if ( tList == null ) {
            return null;
        }

        List<ScheduleIdDto> list = new ArrayList<ScheduleIdDto>( tList.size() );
        for ( ScheduleEntity scheduleEntity : tList ) {
            list.add( convertEntityToDto( scheduleEntity ) );
        }

        return list;
    }
}
