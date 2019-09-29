package se.ec.ahmed;


import data_Access.courseDaoList;
import data_Access.studentDaoList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarOutputStream;


public class newApp {
    private static courseDaoList courseList = new courseDaoList();
    private static studentDaoList studentList = new studentDaoList();

   private static Scanner scanner= new Scanner(System.in);



    public static void helloSchool(){
        System.out.println(
                "1:create new course and Student\n"+
                        "2:register and unregister students to/from course \n"+
                        "3:find student and courses \n"+
                        "4:Edit Students and Course \n"+
                        "*****************************************************");
        LocalDate data;
        data = LocalDate.of(2019,05,03);
        /*Course course1 = new Course("Sulub's Hitsory",001,12,data);
        Course course2 = new Course("Sulub's Sience",001,12,data);
        Course course3 = new Course("Sulub' math",001,12,data);
        Course course4 = new Course("Sulub' java classes",001,12,data);

        Student student1 = new Student("ahmed",619,"aahmedabdi98@gmail.com"," Sulub vägen 1");
        Student student2 = new Student("olle",619,"ollebolle@gmail.com"," Sulub vägen 2");
        Student student3 = new Student("kalle",619,"kalleballe@gmail.com"," Sulub vägen 3");
        Student student4 = new Student("adam",619,"wehooo@gmail.com"," Sulub vägen 4");
        Student student5 = new Student("sulub",619,"legend@gmail.com"," Sulub vägen 5");
*/

    }





    private static List<Student> students = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();


    public static void ifStatements() {
        Course course = new Course();
        Student student = new Student();
        Scanner input = new Scanner(System.in);
        boolean bool = true;
        int val = 0;
        String choices = "";
        helloSchool();
        val = input.nextInt();
        choices = input.nextLine();

        while (bool) {

            switch (val) {

                case 1:
                    System.out.println("to create course press 01 to create student press 02");

                    if (val == 01) {

                        System.out.println("create course Name");
                        course.setCourseName(input.next());
                        System.out.println("create course ID");
                        course.setId(input.nextInt());
                        System.out.println("Start course  yyyy-mm-dd");
                        course.setStartDate(LocalDate.parse(input.next()));
                        System.out.println("create course weeksDuration");
                        course.setWeekDuration(input.nextInt());
                        System.out.println("registered " + student.toString());
                    }
                    if (val == 02) {

                        System.out.println("create Student name");
                        student.setName(input.next());
                        System.out.println("create student ID");
                        student.setId(input.nextInt());
                        System.out.println("create student email");
                        student.setEmail(input.next());
                        System.out.println("create students address");
                        student.setAddress(input.next());
                        System.out.println("registered " + student.toString());

                    }
                    helloSchool();

                    val = input.nextInt();


                    break;

                case 2:
                    System.out.println("press r to register student and u to unregister");
                    val = input.nextInt();
                    if (choices.equals("r")) {
                        System.out.println("register student with email");
                    }
                    choices = input.next();
                    if (choices.contains(student.getEmail())) {
                        course.register(student);
                    }
                    System.out.println(student.getEmail() + " registered");
                    if (choices.equals("u")) {
                        System.out.println("unregistered student with Email");
                        choices = input.next();
                        if (choices.equals(student.getEmail())) {
                            course.unregister(student);
                        }
                        System.out.println(student.getEmail() + " unregistered");
                    }
                    helloSchool();
                    val = input.nextInt();

                    break;
                case 3:
                    System.out.println("press 31 to find courses and 32 to find students");
                    val = input.nextInt();
                    if (val == 31) {
                        System.out.println("Search course by id");
                        val = input.nextInt();
                        // en annan lösning till if-satsen choices.equals(cao.findById(choices))
                        if (val == course.getId()) {
                            System.out.println(course.toString());
                        }
                    }
                    if (val == 32) {
                        System.out.println("Search student by id");
                        val = input.nextInt();
                        // en annan lösning till if-satsen choices.equals(sao.findById(choices))
                        if (val == student.getId()) {

                            System.out.println(student.toString());
                        }
                    }
                    helloSchool();
                    val = input.nextInt();

                    break;

                case 4:

                    System.out.println("press 11 to edit course and 12 to edit student");
                    val = input.nextInt();
                    if (val == 11) {
                        System.out.println("Edit course by Id");
                        val = input.nextInt();
                        // en annan lösning till if-satsen choices.equals(cao.findById(choices))
                        if (val == course.getId()) {
                            System.out.println("Create course name");
                            course.setCourseName(input.next());
                            System.out.println("Create startDate YYYY-MM-DD");
                            course.setStartDate(LocalDate.parse(input.next()));
                            System.out.println("Create weekDuration");
                            course.setWeekDuration(input.nextInt());
                            System.out.println("Edited " + course.toString() + "\n\n\n");
                        }
                        if (val == 12) {
                            System.out.println("Edit student by Id");
                            val = input.nextInt();
                            // en annan lösning till if-satsen choices.equals(cao.findById(choices))
                            if (val == student.getId()) {
                                System.out.println("Create student name");
                                student.setName(input.next());
                                System.out.println("Create email");
                                student.setEmail(input.next());
                                System.out.println("Create address");
                                student.setAddress(input.next());
                                System.out.println("Edited" + student.toString() + "\n\n\n");
                            }
                        }
                        helloSchool();
                        val = input.nextInt();

                        break;


                    }

            }

        }
    }

    public static void main(String[] args) {
        ifStatements();
    }
}


