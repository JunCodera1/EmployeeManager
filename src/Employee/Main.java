package Employee;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		EmployeesManager manager = new EmployeesManager();
		
		Experience employee1 = new Experience("001", "John Doe", "1990-01-01", "123456789", "john@example.com", "Experience", 5, "Java");
        Fresher employee2 = new Fresher("002", "Jane Smith", "1995-05-05", "987654321", "jane@example.com", "Fresher", "2020-07-15", "Excellent", "University XYZ");
        Intern employee3 = new Intern("003", "Alice Johnson", "2000-10-10", "111222333", "alice@example.com", "Intern", "Computer Science", "Spring 2024", "University ABC");
        
        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        manager.addEmployee(employee3);
        
        System.out.println("All employees : ");
        List<Employee> allEmployees = manager.getAllEmployee();
        for(Employee employee : allEmployees) {
        	employee.showInfo();
        	System.out.println();
        }
        
        manager.removeEmployee(employee2);
        
        System.out.println("Employees after removing : ");
        
        for(Employee employee : allEmployees) {
        	employee.showInfo();
        	System.out.println();
        }
	}
}
