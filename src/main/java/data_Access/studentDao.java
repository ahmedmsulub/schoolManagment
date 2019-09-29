package data_Access;

import se.ec.ahmed.Student;

import java.util.List;

public interface studentDao {
    Student saveStudent(Student students);
    Student  findByEmail(String email);
    Student findByName(String name);
    Student findById(int id);
    List<Student> findAll();
    boolean deleteStudent(Student students);
}
