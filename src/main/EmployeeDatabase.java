package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class EmployeeDatabase {
    private List<Employee> employees;

    public EmployeeDatabase() {
        this.employees = new ArrayList<>();
    }

    public void createEmployee(Employee employee) {
        employees.add(employee);
        employee.Employee_count++;
    }

    public void updateEmployee(String ID, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
        	// get value i , id around 0 to employees.size() - 1
            if (employees.get(i).ID.equals(ID)) {
                employees.set(i, updatedEmployee);
                break;
            }
        }
    }

    public void deleteEmployee(String ID) {
        employees.removeIf(employee -> employee.ID.equals(ID));
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println("---------------------");
        }
    }

    public void writeToCSV(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Employee employee : employees) {
                writer.println(employee.ID + "," + employee.FullName + "," + employee.BirthDay + "," +
                        employee.Phone + "," + employee.Email + "," + employee.Employee_type + "," + employee.Employee_count);
            }
        } catch (IOException e) {	
            e.printStackTrace();
        }
    }
    
    //Read files
    public void readFromCSV(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 7) {
                    Employee employee = new Employee(parts[0], parts[1], parts[2], parts[3], parts[4]);
                    employee.Employee_type = parts[5];
                    employee.Employee_count = Integer.parseInt(parts[6]);
                    employees.add(employee);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

