package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.dto.PatientDto;
import ir.mapsa.clinic.entity.PatientEntity;
import ir.mapsa.clinic.entity.PatientEntity.PatientEntityBuilder;
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
public class PatientMapperImpl implements PatientMapper {

    @Override
    public PatientEntity convertDtoToEntity(PatientDto d) {
        if ( d == null ) {
            return null;
        }

        PatientEntityBuilder patientEntity = PatientEntity.builder();

        patientEntity.id( d.getId() );
        patientEntity.firstName( d.getFirstName() );
        patientEntity.lastName( d.getLastName() );
        patientEntity.phoneNumber( d.getPhoneNumber() );
        patientEntity.email( d.getEmail() );
        patientEntity.gender( d.getGender() );
        patientEntity.isActive( d.getIsActive() );

        return patientEntity.build();
    }

    @Override
    public PatientDto convertEntityToDto(PatientEntity t) {
        if ( t == null ) {
            return null;
        }

        PatientDto patientDto = new PatientDto();

        patientDto.setCreatedDate( t.getCreatedDate() );
        patientDto.setLastModifiedDate( t.getLastModifiedDate() );
        patientDto.setId( t.getId() );
        patientDto.setFirstName( t.getFirstName() );
        patientDto.setLastName( t.getLastName() );
        patientDto.setPhoneNumber( t.getPhoneNumber() );
        patientDto.setEmail( t.getEmail() );
        patientDto.setGender( t.getGender() );
        patientDto.setIsActive( t.getIsActive() );

        return patientDto;
    }

    @Override
    public List<PatientEntity> convertListDtoToListEntity(List<PatientDto> dList) {
        if ( dList == null ) {
            return null;
        }

        List<PatientEntity> list = new ArrayList<PatientEntity>( dList.size() );
        for ( PatientDto patientDto : dList ) {
            list.add( convertDtoToEntity( patientDto ) );
        }

        return list;
    }

    @Override
    public List<PatientDto> convertListEntityToListDto(List<PatientEntity> tList) {
        if ( tList == null ) {
            return null;
        }

        List<PatientDto> list = new ArrayList<PatientDto>( tList.size() );
        for ( PatientEntity patientEntity : tList ) {
            list.add( convertEntityToDto( patientEntity ) );
        }

        return list;
    }
}
