package Employee;

public class Employee implements IEmployee{
	String ID;
	String fullName;
	String birthday;
	String phone;
	String email;
	String employee_type;
	public Employee(String ID, String fullName, String birthday, String phone, String email, String employee_type) {
		this.ID = ID;
		this.fullName = fullName;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.employee_type = employee_type;
	}
	
	public void showInfo() {
		System.out.println("ID : " + ID);
		System.out.println("Full Name : " + fullName);
		System.out.println("Birthday : " + birthday);
		System.out.println("Phone number : " + phone);
		System.out.println("Employee type : " + employee_type);
	}
}

