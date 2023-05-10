package com.one.one.services;

import java.util.ArrayList;
import java.util.List;

import com.one.one.entities.Course;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(11,"Java","This is java"));
    }

    @Override
    public Course getCourses() {
        return list.get(0);
    }


    @Override
    public Course addCourse(Course course) {
        // TODO Auto-generated method stub
        list.add(course);
        return course;
    }
    
}
