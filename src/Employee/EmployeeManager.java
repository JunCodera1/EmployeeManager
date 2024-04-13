package Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	private List<Employee> employees;
	
	public EmployeeManager() {
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return employees;
	}
}
