package sv.iuh.facultyservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.iuh.facultyservice.entity.Faculty;
import sv.iuh.facultyservice.repository.FacultyRepository;

@Service
@Slf4j
//@RequiredArgsConstructor
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public Faculty saveFaculty(Faculty faculty) {
        log.info("Inside saveDepartment of Service! ");
        return facultyRepository.save(faculty);
    }

    public Faculty findFacultyById(Long id) {
        log.info("inside findDeparmentById ");
        return facultyRepository.findById(id).get();
    }
}
