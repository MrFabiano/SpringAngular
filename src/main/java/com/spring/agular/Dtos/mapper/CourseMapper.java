package com.spring.agular.Dtos.mapper;

import com.spring.agular.Dtos.CourseDTO;
import com.spring.agular.model.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {

    public CourseDTO toDTO(Course course){
        if(course == null){
            return null;
        }
        return new CourseDTO(course.getId(), course.getName(), course.getCategory());
    }

    public Course toCourse(CourseDTO courseDTO){
        Course course = new Course();
         if(courseDTO.id() != null){
             course.setId(courseDTO.id());
         }
         course.setName(courseDTO.name());
         course.setCategory(courseDTO.category());
         course.setStatus("Ativo");
        return course;
    }
}