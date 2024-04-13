package Employee;

public class Experience extends Employee implements IEmployee{
	
	int expInYear;
	String proSkill;
	
	public Experience(String ID, String fullName, String birthday, String phone, String email, String employee_type, int expInYear, String proSkill) {
		super(ID, fullName, birthday, phone, email, employee_type);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Experience in Years: " + expInYear);
		System.out.println("Professional Skill: " + proSkill);
	}
}
