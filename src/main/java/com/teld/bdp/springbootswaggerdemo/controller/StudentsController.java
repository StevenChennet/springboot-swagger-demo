package com.teld.bdp.springbootswaggerdemo.controller;


import com.teld.bdp.springbootswaggerdemo.model.Student;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/student")
@Api(tags = "学生Webapi")
public class StudentsController {

    @GetMapping("/")
    @ApiOperation(value = "获取所有学生列表")
    public List<Student> getAllStudents() {
        return Arrays.asList(
                Student.builder().id("zhangsan").name("张三").age(10).build(),
                Student.builder().id("lisi").name("李四").age(11).build());
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable String id) {
        return Student.builder().id(id).name("张三").age(10).build();
    }

    @PostMapping("/")
    public void create(@Valid @RequestBody Student student) {

    }

    @PutMapping("/{id}")
    public void update(
            @PathVariable(value = "id") String id,
            @Valid @RequestBody Student student) {

    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(value = "id") String id) {

    }
}
