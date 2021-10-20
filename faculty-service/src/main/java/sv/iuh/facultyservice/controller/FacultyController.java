package sv.iuh.facultyservice.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.iuh.facultyservice.entity.Faculty;
import sv.iuh.facultyservice.service.FacultyService;

@RestController
@RequestMapping("/faculty")
@Slf4j

public class FacultyController {



    private String welcome = "Hello!";

    @GetMapping("/")
    public String helloWorld(){
        return  welcome;
    }


    @Autowired
    private FacultyService facultyService;

    @PostMapping("/")
    public Faculty saveFaculty(@RequestBody Faculty faculty){
        log.info("inside saveFaculty method if Faculty controller!");
        return facultyService.saveFaculty(faculty);
    }

    @GetMapping("/{id}")
    public Faculty findFacultyById(@PathVariable("id") Long id){
        log.info("inside findFacultyById method if Faculty controller!");
        return facultyService.findFacultyById(id);
    }

}
