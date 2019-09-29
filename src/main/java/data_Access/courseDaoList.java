package data_Access;

import se.ec.ahmed.Course;
import java.time.LocalDate;
import java.util.List;

public class courseDaoList implements CourseDao{
    private static List<Course> courses;

    @Override
    public Course saveCourse(Course course) {
        courses.add(course);
        if(courses.contains(course)){
            return course;
        }
        return null;
    }

    @Override
    public Course findById(int id) {
        for(Course course:courses){
            if (course.getId()==id){
                return course;
            }
        }
        return null;
    }

    @Override
    public List<Course> findByName(String name) {
        for (Course course:courses){
            if(course.getCourseName().equalsIgnoreCase(name)){
                return courses;
            }
        }
        return null;
    }

    @Override
    public List<Course> findAll() {
        for(Course course:courses){
            return courses;
        }
        return null;
    }
    @Override
    public List<Course>findByDate(LocalDate date){
        for (Course course:courses){
            if(course.getStartDate().equals(date)){
                return courses;
            }
        }
        return null;
    }

    @Override
    public boolean removeCourse(Course course) {
       for(Course courseDel:courses){
           if(courseDel.getCourseName().equals(course)){
               courses.remove(courseDel);
           }
       }
        return false;
    }
}
