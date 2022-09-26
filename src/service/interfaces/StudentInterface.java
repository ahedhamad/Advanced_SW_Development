package service.interfaces;

import model.StudentList;
import model.general.Student;

import java.util.List;

public interface StudentInterface {
    public Student addStudent(StudentList studentList,Student student);
    public StudentList retrieveStudent(StudentList studentList);
    public StudentList removeStudent(StudentList studentList,Student student, int id);
    public void report (StudentList studentList);
    public void print(StudentList studentList, int studentId);
    public long getAge(StudentList studentList, int studentId);
}
