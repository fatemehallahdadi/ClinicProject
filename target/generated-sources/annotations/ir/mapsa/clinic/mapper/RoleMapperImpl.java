package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.RoleEntity.RoleEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-05T16:28:44+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleEntity convertDtoToEntity(RoleDto d) {
        if ( d == null ) {
            return null;
        }

        RoleEntityBuilder roleEntity = RoleEntity.builder();

        roleEntity.id( d.getId() );
        roleEntity.role( d.getRole() );

        return roleEntity.build();
    }

    @Override
    public RoleDto convertEntityToDto(RoleEntity t) {
        if ( t == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setCreatedDate( t.getCreatedDate() );
        roleDto.setLastModifiedDate( t.getLastModifiedDate() );
        roleDto.setId( t.getId() );
        roleDto.setRole( t.getRole() );

        return roleDto;
    }

    @Override
    public List<RoleEntity> convertListDtoToListEntity(List<RoleDto> dList) {
        if ( dList == null ) {
            return null;
        }

        List<RoleEntity> list = new ArrayList<RoleEntity>( dList.size() );
        for ( RoleDto roleDto : dList ) {
            list.add( convertDtoToEntity( roleDto ) );
        }

        return list;
    }

    @Override
    public List<RoleDto> convertListEntityToListDto(List<RoleEntity> tList) {
        if ( tList == null ) {
            return null;
        }

        List<RoleDto> list = new ArrayList<RoleDto>( tList.size() );
        for ( RoleEntity roleEntity : tList ) {
            list.add( convertEntityToDto( roleEntity ) );
        }

        return list;
    }
}
