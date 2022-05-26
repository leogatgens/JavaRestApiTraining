package com.Mejenga.TuMejenga.controller;

import com.Mejenga.TuMejenga.bean.Course;
import com.Mejenga.TuMejenga.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class MejengaController {
        @Autowired
        private CourseRepository repository;


        //http://localhost:8080
        @GetMapping("/courses")
        public List<Course> getAllCourses(){
            return repository.findAll();
        }

        //http://localhost:8080
        @GetMapping("/courses/{id}")
        public Course getCourseDetails(@PathVariable long id){
                Optional<Course> course = repository.findById(id);
                if(course.isEmpty()){
                        throw new RuntimeException("Course not found" + id);
                }
                return course.get();
        }
        //POST -  Create a new resource (/courses)
        @PostMapping("/courses")
        public void createCourse(@RequestBody Course course){
                repository.save(course);
        }

        //PUT -  Update/Replace a resource (/courses)
        @PutMapping("/courses/{id}")
        public void updateCourse(@PathVariable long id, @RequestBody Course course){
                repository.save(course);
        }


        //DELETE -  Delete by id
        @DeleteMapping("/courses/{id}")
        public void deleteCourse(@PathVariable long id){
               Optional<Course> course = repository.findById(id);
               if(course.isEmpty()){
                       throw  new RuntimeException("Ese curso no existe: " + id);
               }


                repository.deleteById(id);
        }


}
