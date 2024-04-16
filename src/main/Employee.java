package main;

class Employee implements IEmployee {
    protected String ID;
    protected String FullName;
    protected String BirthDay;
    protected String Phone;
    protected String Email;
    protected String Employee_type;
    protected int Employee_count;

    public Employee(String ID, String FullName, String BirthDay, String Phone, String Email) {
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.Employee_type = "";
        this.Employee_count = 0;
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Full Name: " + FullName);
        System.out.println("Birth Day: " + BirthDay);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
        System.out.println("Employee Type: " + Employee_type);
        System.out.println("Employee Count: " + Employee_count);
    }
}
