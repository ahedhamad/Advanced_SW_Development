package model;

import model.general.Student;

public class MasterStudent extends Student {

     enum bADegree {
         Good,
         VeryGood,
         Excellent
     }
    public String research;

    public String getResearch() {
        return research;
    }

    public void submitResearch(String research) {
        this.research = research;
        System.out.print("student adds a research paper");
    }
    public String supervisor;

    public String getSupervisor() {
        return supervisor;
    }

    public void setResearch(String research) {
        this.research = research;
    }
}
