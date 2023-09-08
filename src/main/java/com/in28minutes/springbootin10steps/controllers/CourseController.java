package com.in28minutes.springbootin10steps.controllers;

import com.in28minutes.springbootin10steps.entities.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return List.of(new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn Docker", "in28minutes"),
                new Course(3, "Learn Kubernetes", "in28minutes"),
                new Course(4, "Learn Azure", "in28minutes"));
    }
}
