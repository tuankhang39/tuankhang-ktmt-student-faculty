package sv.iuh.studentservice.VO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sv.iuh.studentservice.entity.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseTemplateVO {
    private Student student;
    private Faculty faculty;
}
