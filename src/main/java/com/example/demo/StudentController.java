package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService)
    {
        this.studentService=studentService;
    }

    @GetMapping ("/getList")
    @ResponseBody
    public List<Student> getList()
    {
        return studentService.getList();
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
    }

    @RequestMapping("/")
    public String home()
    {
        return "Home.jsp";
    }

}
