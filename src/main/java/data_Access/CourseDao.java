package data_Access;

import se.ec.ahmed.Course;

import java.time.LocalDate;
import java.util.List;



public interface CourseDao{
    Course saveCourse(Course course);
    Course findById(int id);
    List<Course> findByName(String name);
    List<Course>findAll();
    List<Course>findByDate(LocalDate date);
    boolean removeCourse(Course course);



}
