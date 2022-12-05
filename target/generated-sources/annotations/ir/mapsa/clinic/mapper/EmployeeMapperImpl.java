package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.dto.EmployeeDto;
import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.EmployeeEntity.EmployeeEntityBuilder;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.RoleEntity.RoleEntityBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-05T16:28:44+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeEntity convertDtoToEntity(EmployeeDto d) {
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
        employeeEntity.roles( roleDtoSetToRoleEntitySet( d.getRoles() ) );

        return employeeEntity.build();
    }

    @Override
    public EmployeeDto convertEntityToDto(EmployeeEntity t) {
        if ( t == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setCreatedDate( t.getCreatedDate() );
        employeeDto.setLastModifiedDate( t.getLastModifiedDate() );
        employeeDto.setId( t.getId() );
        employeeDto.setFirstName( t.getFirstName() );
        employeeDto.setLastName( t.getLastName() );
        employeeDto.setPhoneNumber( t.getPhoneNumber() );
        employeeDto.setEmail( t.getEmail() );
        employeeDto.setGender( t.getGender() );
        employeeDto.setRoles( roleEntitySetToRoleDtoSet( t.getRoles() ) );

        return employeeDto;
    }

    @Override
    public List<EmployeeEntity> convertListDtoToListEntity(List<EmployeeDto> dList) {
        if ( dList == null ) {
            return null;
        }

        List<EmployeeEntity> list = new ArrayList<EmployeeEntity>( dList.size() );
        for ( EmployeeDto employeeDto : dList ) {
            list.add( convertDtoToEntity( employeeDto ) );
        }

        return list;
    }

    @Override
    public List<EmployeeDto> convertListEntityToListDto(List<EmployeeEntity> tList) {
        if ( tList == null ) {
            return null;
        }

        List<EmployeeDto> list = new ArrayList<EmployeeDto>( tList.size() );
        for ( EmployeeEntity employeeEntity : tList ) {
            list.add( convertEntityToDto( employeeEntity ) );
        }

        return list;
    }

    protected RoleEntity roleDtoToRoleEntity(RoleDto roleDto) {
        if ( roleDto == null ) {
            return null;
        }

        RoleEntityBuilder roleEntity = RoleEntity.builder();

        roleEntity.id( roleDto.getId() );
        roleEntity.role( roleDto.getRole() );

        return roleEntity.build();
    }

    protected Set<RoleEntity> roleDtoSetToRoleEntitySet(Set<RoleDto> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleEntity> set1 = new HashSet<RoleEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleDto roleDto : set ) {
            set1.add( roleDtoToRoleEntity( roleDto ) );
        }

        return set1;
    }

    protected RoleDto roleEntityToRoleDto(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setCreatedDate( roleEntity.getCreatedDate() );
        roleDto.setLastModifiedDate( roleEntity.getLastModifiedDate() );
        roleDto.setId( roleEntity.getId() );
        roleDto.setRole( roleEntity.getRole() );

        return roleDto;
    }

    protected Set<RoleDto> roleEntitySetToRoleDtoSet(Set<RoleEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDto> set1 = new HashSet<RoleDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleEntity roleEntity : set ) {
            set1.add( roleEntityToRoleDto( roleEntity ) );
        }

        return set1;
    }
}
