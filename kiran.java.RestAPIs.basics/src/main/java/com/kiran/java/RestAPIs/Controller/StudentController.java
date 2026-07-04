package com.kiran.java.RestAPIs.Controller;

import java.util.List;
import java.util.ArrayList;

import com.kiran.java.RestAPIs.Bean.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class StudentController {

    @GetMapping("student")

    public Student getStudent(){
        Student student = new Student(
                1,
                "Ravi",
                "Kiran"
        );
        return student;
    }
//    List
@GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ravi", "Kiran"));
        students.add(new Student(2, "Kiran", "thej"));
        students.add(new Student(3, "Krishn", "Radha"));

        return students;
    }


    // Spring BOOT REST API with Path Variable
    // {id} - URI template variable
    @GetMapping("students/{id}")
    public Student studentPathVariable(@PathVariable("id") int studentId){
        return new Student(studentId, "Kiran", "Vasishta");

    }
    // http://localhost:8080/students/1/kiran/ravi
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                                       @PathVariable("first-name") String firstName,
                                                       @PathVariable("last-name") String lastName){
        return new Student(studentId, firstName, lastName);
    }


    //http://localhost:8080/student/query?id=2
// Spring boot REST API with Request PAram
    @GetMapping("student/query")

    public Student studentRequestVariable(@RequestParam int id){
        return new Student(id, "Kiran", "Iyengar");

    }

    //http://localhost:8080/student/query?id=2&firstName=Kiran&lastName=Ram
// Spring boot REST API with Request PAram
    @GetMapping("students/query")

    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        return new Student(id, firstName, lastName);

    }

    // Spring boot REST API that handles HTTP POST Request - creating new resource
    // @PostMapping and @RequestBody
    @PostMapping("students/create")
    //@ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    // Spring boot REST API that handles HTTP PUT Request - updating existing resource
    @PutMapping("students/{id}/update")
    public Student updateStudent(@RequestBody Student student,
                                 @PathVariable("id")
                                 int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }


    // Spring boot REST API that handles HTTP DELETE Request - deleting the existing resource
    @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id")
                                                int studentId){
        System.out.println(studentId);
        return ResponseEntity.ok("Student deleted successfully!");
    }


}
