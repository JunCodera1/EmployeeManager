package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
    	// Khởi tạo file
        EmployeeDatabase database = new EmployeeDatabase();
        
        // Tạo thành viên
        Experience experienceEmployee = new Experience("001", "John Doe", "1990-01-01", "123456789", "john@example.com", 5, "Java");
        database.createEmployee(experienceEmployee);

        Fresher fresherEmployee = new Fresher("002", "Jane Smith", "1995-05-05", "987654321", "jane@example.com", "2023-05-30", "Excellent", "ABC University");
        database.createEmployee(fresherEmployee);

        Intern internEmployee = new Intern("003", "Alex Johnson", "2000-10-10", "456789123", "alex@example.com", "Computer Science", "Spring 2024", "XYZ College");
        database.createEmployee(internEmployee);

        // In ra màn hình console
        System.out.println("All Employees:");
        database.displayAllEmployees();

        // Cập nhật thành viên mới
        Fresher updatedFresher = new Fresher("002", "Jane Smith", "1995-05-05", "987654321", "jane_updated@example.com", "2023-05-30", "Excellent", "ABC University");
        database.updateEmployee("002", updatedFresher);

        // In tất cả các thành viên ra màn hình 
        System.out.println("All Employees after update:");
        database.displayAllEmployees();

        // Xóa thành viên
        database.deleteEmployee("001");

        // Display all employees after delete
        System.out.println("All Employees after delete:");
        database.displayAllEmployees();

        // Viết file
        database.writeToCSV("employees.csv");

        // Đọc thông tin trong file
        EmployeeDatabase newDatabase = new EmployeeDatabase();
        newDatabase.readFromCSV("employees.csv");
        System.out.println("All Employees read from CSV:");
        newDatabase.displayAllEmployees();
    }
}

