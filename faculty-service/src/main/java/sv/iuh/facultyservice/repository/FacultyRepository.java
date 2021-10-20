package sv.iuh.facultyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.iuh.facultyservice.entity.Faculty;

@Repository
public interface FacultyRepository
        extends JpaRepository<Faculty, Long> {

    //Department findDepartmentById(Long departmentId);
}

