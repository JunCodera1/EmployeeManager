package main;

class Intern extends Employee {
    private String Majors;
    private String Semester;
    private String University_name;

    public Intern(String ID, String FullName, String BirthDay, String Phone, String Email, String Majors, String Semester, String University_name) {
        super(ID, FullName, BirthDay, Phone, Email);
        this.Employee_type = "Intern";
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
    }
    
    //Extends
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Majors: " + Majors);
        System.out.println("Semester: " + Semester);
        System.out.println("University Name: " + University_name);
    }
}
