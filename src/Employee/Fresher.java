package Employee;

public class Fresher extends Employee implements IEmployee {
	
	String graduation_date;
	String graduation_rank;
	String education;
	public Fresher(String ID, String fullName, String birthday, 
			String phone, String email, String employee_type, String graduation_date, String graduation_rank, String education) {
		super(ID, fullName, birthday, phone, email, employee_type);
		this.graduation_date = graduation_date;
		this.graduation_rank = graduation_rank;
		this.education = education;
		
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Graduation date : "  + graduation_date);
		System.out.println("Graduation rank : " + graduation_rank);
		System.out.println("Education : " + education);
	}
	
}
