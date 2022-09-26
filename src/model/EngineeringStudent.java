package model;

import model.general.Student;

public class EngineeringStudent extends Student {
    private String lab;

    public String getLab() {
        return lab;
    }

    public void submitLab(String lab) {
        this.lab = lab;
        System.out.print("lab has been submit.");
    }
}
