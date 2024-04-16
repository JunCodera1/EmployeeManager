package main;

public class Experience extends Employee {
    private int ExpInYear;
    private String ProSkill;

    public Experience(String ID, String FullName, String BirthDay, String Phone, String Email, int ExpInYear, String ProSkill) {
        super(ID, FullName, BirthDay, Phone, Email);
        this.Employee_type = "Experience";
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }
    
    //Extends
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Experience In Year: " + ExpInYear);
        System.out.println("Professional Skill: " + ProSkill);
    }
}

