package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.dto.EmployeeIdDto;
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.EmployeeEntity.EmployeeEntityBuilder;
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
public class EmployeeIdMapperImpl implements EmployeeIdMapper {

    @Override
    public EmployeeEntity convertDtoToEntity(EmployeeIdDto d) {
        if ( d == null ) {
            return null;
        }

        EmployeeEntityBuilder employeeEntity = EmployeeEntity.builder();

        employeeEntity.id( d.getId() );
        employeeEntity.firstName( d.getFirstName() );
        employeeEntity.lastName( d.getLastName() );
        employeeEntity.phoneNumber( d.getPhoneNumber() );
        employeeEntity.email( d.getEmail() );
        employeeEntity.gender( d.getGender() );

        return employeeEntity.build();
    }

    @Override
    public EmployeeIdDto convertEntityToDto(EmployeeEntity t) {
        if ( t == null ) {
            return null;
        }

        EmployeeIdDto employeeIdDto = new EmployeeIdDto();

        employeeIdDto.setCreatedDate( t.getCreatedDate() );
        employeeIdDto.setLastModifiedDate( t.getLastModifiedDate() );
        employeeIdDto.setId( t.getId() );
        employeeIdDto.setFirstName( t.getFirstName() );
        employeeIdDto.setLastName( t.getLastName() );
        employeeIdDto.setPhoneNumber( t.getPhoneNumber() );
        employeeIdDto.setEmail( t.getEmail() );
        employeeIdDto.setGender( t.getGender() );

        return employeeIdDto;
    }

    @Override
    public List<EmployeeEntity> convertListDtoToListEntity(List<EmployeeIdDto> dList) {
        if ( dList == null ) {
            return null;
        }

        List<EmployeeEntity> list = new ArrayList<EmployeeEntity>( dList.size() );
        for ( EmployeeIdDto employeeIdDto : dList ) {
            list.add( convertDtoToEntity( employeeIdDto ) );
        }

        return list;
    }

    @Override
    public List<EmployeeIdDto> convertListEntityToListDto(List<EmployeeEntity> tList) {
        if ( tList == null ) {
            return null;
        }

        List<EmployeeIdDto> list = new ArrayList<EmployeeIdDto>( tList.size() );
        for ( EmployeeEntity employeeEntity : tList ) {
            list.add( convertEntityToDto( employeeEntity ) );
        }

        return list;
    }
}
