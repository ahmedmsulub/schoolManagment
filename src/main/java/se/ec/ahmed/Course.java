package se.ec.ahmed;

import java.time.LocalDate;
import java.util.List;

public class Course {
    private int id;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration;
    private List<Student> students;

  /*  public Course(String courseName,int id, int weekDuration,LocalDate startDate){
        this.id=id;
        this.courseName=courseName;
        this.startDate=startDate;
        this.weekDuration=weekDuration;
        this.students=students;
    }*/



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void register(Student student){
        if(!students.contains(student)){
            students.add(student);
            System.out.println("registered "+student.getName());
        }

    }
    public void unregister(Student student){
    students.remove(student);
        System.out.println("unregistered "+student.getName());
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName=" + courseName +
                ", id='" + id + '\'' +
                ", startDate=" + startDate +
                ", weekDuration=" + weekDuration +
                ", students=" + students +
                '}';
    }
}
