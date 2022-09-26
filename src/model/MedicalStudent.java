package model;

import model.general.Student;

public class MedicalStudent extends Student {

    Hospital hospital= new Hospital();

    public String research;

    public String getResearch() {
        return research;
    }

    public void submitResearch(String research) {
        this.research = research;
    }

}

