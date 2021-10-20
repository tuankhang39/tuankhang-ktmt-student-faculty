package sv.iuh.studentservice.service;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sv.iuh.studentservice.VO.Faculty;
import sv.iuh.studentservice.VO.ResponseTemplateVO;
import sv.iuh.studentservice.entity.Student;
import sv.iuh.studentservice.repository.StudentRepository;

@Service
public class StudentService {



    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Student saveStudent(Student user) {
        return studentRepository.save(user);
    }


    public ResponseTemplateVO getStudentWithDepartment(Long id) {

        ResponseTemplateVO vo = new ResponseTemplateVO();
        Student student = studentRepository.findById(id).get();
        vo.setStudent(student);
        Faculty faculty =
                restTemplate.getForObject("http://localhost:9001/faculty/"
                                + student.getDepartmentId(),
                        Faculty.class);

        vo.setFaculty(faculty);
        return vo;
    }

}
