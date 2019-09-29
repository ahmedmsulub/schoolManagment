package data_Access;


import se.ec.ahmed.Student;
import java.util.List;

 public class studentDaoList implements studentDao{
     private static List<Student> students;

    @Override
    public Student saveStudent(Student student){
        students.add(student);
            if (students.contains(student)){
                return student;
            }
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        for (Student student:students) {
            if(student.getEmail().equalsIgnoreCase(email)){
                return student;
            }

        }
        return null;

    }

    @Override
    public Student findByName(String name) {
        for(Student student:students){
            if (student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findById(int id) {
       for (Student student : students){
           if(student.getId()==id){
               return student;
           }
       }
       return null;
    }

    @Override
    public List<Student> findAll() {
        for (Student student:students){
            return students;
        }
        return null;
    }

    @Override
    public boolean deleteStudent(Student student) {
        for (Student studentDel:students) {
            if(studentDel.getName().equals(students)){
                students.remove(studentDel);
            }
        }
        return false;
    }


}