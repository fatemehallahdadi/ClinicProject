package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.dto.DepartmentDto;
import ir.mapsa.clinic.entity.DepartmentEntity;
import ir.mapsa.clinic.entity.DepartmentEntity.DepartmentEntityBuilder;
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
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public DepartmentEntity convertDtoToEntity(DepartmentDto d) {
        if ( d == null ) {
            return null;
        }

        DepartmentEntityBuilder departmentEntity = DepartmentEntity.builder();

        departmentEntity.id( d.getId() );
        departmentEntity.description( d.getDescription() );
        departmentEntity.name( d.getName() );

        return departmentEntity.build();
    }

    @Override
    public DepartmentDto convertEntityToDto(DepartmentEntity t) {
        if ( t == null ) {
            return null;
        }

        DepartmentDto departmentDto = new DepartmentDto();

        departmentDto.setCreatedDate( t.getCreatedDate() );
        departmentDto.setLastModifiedDate( t.getLastModifiedDate() );
        departmentDto.setId( t.getId() );
        departmentDto.setDescription( t.getDescription() );
        departmentDto.setName( t.getName() );

        return departmentDto;
    }

    @Override
    public List<DepartmentEntity> convertListDtoToListEntity(List<DepartmentDto> dList) {
        if ( dList == null ) {
            return null;
        }

        List<DepartmentEntity> list = new ArrayList<DepartmentEntity>( dList.size() );
        for ( DepartmentDto departmentDto : dList ) {
            list.add( convertDtoToEntity( departmentDto ) );
        }

        return list;
    }

    @Override
    public List<DepartmentDto> convertListEntityToListDto(List<DepartmentEntity> tList) {
        if ( tList == null ) {
            return null;
        }

        List<DepartmentDto> list = new ArrayList<DepartmentDto>( tList.size() );
        for ( DepartmentEntity departmentEntity : tList ) {
            list.add( convertEntityToDto( departmentEntity ) );
        }

        return list;
    }
}
