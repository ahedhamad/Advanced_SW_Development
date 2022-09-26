package controller;

import model.StudentList;
import model.general.Student;
import service.StudentService;

public class StudentController {
    StudentService studentService;

    public void report(StudentList studentList) {
       studentService.report(studentList);
    }
    public boolean equals(Object student) {
        if(studentService.equals(student))
            return true;
        else return false;
    }
    public long getAge(StudentList studentList, int studentId) {
       return studentService.getAge(studentList,studentId);
    }
    public void print(StudentList studentList, int studentId){
        studentService.print(studentList,studentId);
    }
    public StudentList addStudent(StudentList studentList, Student student) {

        return studentService.addStudent(studentList,student);
    }

    public StudentList retrieveStudent(StudentList studentList) {

        return studentService.retrieveStudent(studentList);
    }

    public StudentList removeStudent(StudentList studentList, Student student , int id) {

        return studentService.removeStudent(studentList,student,id);
    }
}
