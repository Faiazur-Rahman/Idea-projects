package org.example.core;

import org.example.course.Course;
import org.example.course.CourseRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements ApplicationRunner {
    private final CourseRepository courseRepository;

    public DatabaseLoader(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Course course = new Course("Java Basics", "https://brainstation23.com/library/java-basics");
        courseRepository.save(course);
    }
}
