package main;

public class Fresher extends Employee {
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher(String ID, String FullName, String BirthDay, String Phone, String Email, String Graduation_date, String Graduation_rank, String Education) {
        super(ID, FullName, BirthDay, Phone, Email);
        this.Employee_type = "Fresher";
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation Date: " + Graduation_date);
        System.out.println("Graduation Rank: " + Graduation_rank);
        System.out.println("Education: " + Education);
    }
}
