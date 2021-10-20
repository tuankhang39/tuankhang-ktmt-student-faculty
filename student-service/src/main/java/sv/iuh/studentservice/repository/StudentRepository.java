package sv.iuh.studentservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.iuh.studentservice.entity.Student;

@Repository
 public interface StudentRepository extends JpaRepository<Student, Long> {


}
