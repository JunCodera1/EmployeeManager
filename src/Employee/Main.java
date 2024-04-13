package Employee;

public class Main {
	public static void main(String[] args) {
		Experience employee1 = new Experience("001", "John Doe", "1990-01-01", "123456789", "john@example.com", "Experience", 5, "Java");
        Fresher employee2 = new Fresher("002", "Jane Smith", "1995-05-05", "987654321", "jane@example.com", "Fresher", "2020-07-15", "Excellent", "University XYZ");
        Intern employee3 = new Intern("003", "Alice Johnson", "2000-10-10", "111222333", "alice@example.com", "Intern", "Computer Science", "Spring 2024", "University ABC");
        
        System.out.println("Employee 1 : ");
        employee1.showInfo();
        System.out.println("\nEmployee 2 : ");
        employee2.showInfo();
        System.out.println("\nEmployee 3 : ");
        employee3.showInfo();
	}
}
