package Employee;

public class Intern extends Employee implements IEmployee{
	
	String majors;
	String semester;
	String university_name;
	public Intern(String ID, String fullName, String birthday, String phone, String email, 
			String employee_type, String majors, String semester, String university_name) {
		super(ID, fullName, birthday, phone, email, employee_type);
		this.majors = majors;
		this.semester = semester;
		this.university_name = university_name;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Major : " + majors);
		System.out.println("Semester : " + semester);
		System.out.println("University name : " + university_name);
	}
	
}
