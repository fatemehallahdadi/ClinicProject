package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity,Long> {
}
