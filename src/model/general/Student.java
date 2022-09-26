package model.general;

import model.StudentList;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Student {
   private int id;
   private String name;
   private LocalDate birthOfDate;

    public int getId() {
        return id;
    }

    public LocalDate getBirthOfDate() {
        return birthOfDate;
    }

    public String getName() {
        return name;
    }

    public void setBirthOfDate(LocalDate birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object student) {
        if (student == null) {
            return false;
        }

        final Student newStudent = (Student) student;
        if (newStudent.getId() == this.getId() && newStudent.getBirthOfDate() == this.getBirthOfDate() && newStudent.getName()==this.getName()){
        return true;
        }

        return false;
    }

    public long getAge() {
            long age = ChronoUnit.YEARS.between(LocalDate.now(), this.getBirthOfDate());
        return age;

    }

    public void print() {
            System.out.print("Student Name" + this.getName());
            System.out.print("Student id" + this.getId());
            System.out.print("Student dateOfBirth" + this.getBirthOfDate());
    }
}
