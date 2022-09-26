package service;

import model.StudentList;
import model.general.Student;
import service.interfaces.StudentInterface;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements StudentInterface {

    static int addCounter = 0 ;
    static int retrieveCounter = 0;
    static int removeCounter = 0 ;
    @Override
    public StudentList addStudent(StudentList studentList, Student student) {

        studentList = new StudentList();
        studentList.addStudent(student);
        addCounter++;

        return studentList;
    }

    @Override
    public StudentList retrieveStudent(StudentList studentList) {
        retrieveCounter++;
        return studentList;
    }

    @Override
    public StudentList removeStudent(StudentList studentList, Student student , int id) {
        studentList = new StudentList();
        studentList.removeStudent(student, id);
        removeCounter++;
        return studentList;
    }

    @Override
    public void report(StudentList studentList) {
        System.out.println("number of students added = " + addCounter);
        System.out.println("number of students retrieved = " + retrieveCounter);
        System.out.println("number of students removed = " + removeCounter);

    }
    public long getAge(StudentList studentList, int studentId) {

        Student student = studentList.findById(studentId);
        long age=0;
        if(student == null){
            return age ;
        }
        else {
            student.getAge();
        }
        return age;

    }

    public void print(StudentList studentList, int studentId) {

        Student student = studentList.findById(studentId);
        if(student == null){
            System.out.print("No student founded");
        }
        else
        {
            System.out.print("Student Name" + student.getName());
            System.out.print("Student id" + student.getId());
            System.out.print("Student dateOfBirth" + student.getBirthOfDate());
        }
    }
}
