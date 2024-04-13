package Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeesManager {
	private List<Employee> employees;
	
	public EmployeesManager() {
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
