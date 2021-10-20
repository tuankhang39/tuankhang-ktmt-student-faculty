package sv.iuh.studentservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import sv.iuh.studentservice.VO.ResponseTemplateVO;
import sv.iuh.studentservice.entity.Student;
import sv.iuh.studentservice.service.StudentService;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@RestController
@RequestMapping("/student")
//@EnableEurekaClient
public class UserController
{
    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public Student saveUser(@RequestBody Student user){

        return studentService.saveStudent(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")

                                                            Long userId){
        return studentService.getStudentWithDepartment(userId);
    }
}
