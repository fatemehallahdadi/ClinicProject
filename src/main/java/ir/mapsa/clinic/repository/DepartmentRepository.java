package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.entity.DepartmentEntity;
import ir.mapsa.clinic.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {

}
