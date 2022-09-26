package model;

import model.general.Student;

import java.util.List;

public class StudentList extends Student {
    public List<Student> Students;
    public Student findById(int id) {
        for (Student i : Students) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }
    public List<Student> addStudent(Student student)
    {
        if(student == null)
            return null ;
        else
        {Students.add(student);}
        return Students;
    }
    public List<Student> removeStudent(Student student,int id)
    {
       if(findById(id) == null)
           return null ;
        else
        {Students.remove(id);}
        return Students ;
    }




}
