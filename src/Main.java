import controller.StudentController;
import model.StudentList;
import model.general.Student;
import service.StudentService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student1= new Student();
        student1.setId(2);
        student1.setName("Ali");
        student1.setBirthOfDate(LocalDate.parse("2018-11-01"));

        Student student2= new Student();
        student2.setId(3);
        student2.setName("Ola");
        student2.setBirthOfDate(LocalDate.parse("2001-2-23"));

        StudentList studentList = new StudentList();

        studentList.addStudent(student1);
        studentList.addStudent(student2);

        StudentController studentController = new StudentController();


        System.out.println("------ Menu ----- ");
        System.out.println("a: Add Student");
        System.out.println("b: Remove Student");
        System.out.println("c: Retrieve Student");
        System.out.println("d: If two object is equals");
        System.out.println("e: to get age student");
        System.out.println("f: to print all information");
        System.out.println("g: report containing numbers of add, retrieve and remove operations");
        System.out.println("q: Quit");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        do {
            switch (choice){
                case "a":
                    studentController.addStudent(studentList,student1);
                    break;
                case "b":
                    studentController.removeStudent(studentList ,student1 , student1.getId());
                    break;
                case "c":
                    studentController.retrieveStudent(studentList);
                    break;
                case "d":
                    studentController.equals(student1);
                    break;
                case "e":
                   studentController.getAge(studentList,student1.getId());
                    break;
                case "f":
                    studentController.print(studentList,student1.getId());
                    break;
                case "g":
                    studentController.report(studentList);
                    break;
            }  }while (choice != "q");

    }
}
