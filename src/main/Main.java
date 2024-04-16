package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        EmployeeDatabase fileData = new EmployeeDatabase();

        do {
            System.out.println("-------------------------MENU------------------------------\n");
            System.out.println("1. Create Employees");
            System.out.println("2. Read and print all");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee with ID");
            System.out.println("5. Write to file");
            System.out.println("6. Read to file and print in console");
            System.out.println("7. Exit");
            System.out.println("-----------------------------------------------------------\n");
            System.out.print("ENTER YOUR CHOICE : ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.print("\n");

            switch (choice) {
                case 1:
                    System.out.println("Enter Information of employees : ");
                    System.out.println("ID : ");
                    String id = sc.next();
                    System.out.println("Name : ");
                    String name = sc.next();
                    System.out.println("Birth : ");
                    String birth = sc.next();
                    System.out.println("Phone number : ");
                    String phoneNumber = sc.next();
                    System.out.println("1. Experience, 2. Fresher, 3. Intern");
                    System.out.println("Enter type of employees :");
                    int type = sc.nextInt();
                    System.out.println("Email : ");
                    String mail = sc.next();
                    if (type == 1) {
                        System.out.println("Enter year Experience : ");
                        int yearExperience = sc.nextInt();
                        System.out.println("Enter pro skill : ");
                        String proSkill = sc.next();
                        Experience experienceEmployee = new Experience(id, name, birth, phoneNumber, mail, yearExperience, proSkill);
                        fileData.createEmployee(experienceEmployee);
                    } else if (type == 2) {
                        System.out.println("Enter graduation date : ");
                        String graduation_date = sc.next();
                        System.out.println("Enter graduation rank : ");
                        String graduation_rank = sc.next();
                        System.out.println("Enter your University : ");
                        String education = sc.next();
                        Fresher fresher = new Fresher(id, name, birth, phoneNumber, mail, graduation_date, graduation_rank, education);
                        fileData.createEmployee(fresher);
                    } else if (type == 3) {
                        System.out.println("Enter majors : ");
                        String major = sc.next();
                        System.out.println("Enter semester : ");
                        String semester = sc.next();
                        System.out.println("Enter your University : ");
                        String education = sc.next();
                        Intern intern = new Intern(id, name, birth, phoneNumber, mail, major, semester, education);
                        fileData.createEmployee(intern);
                    }
                    break;
                case 2:
                    fileData.displayAllEmployees();
                    break;
                case 3:
                    System.out.println("Enter Information to UPDATE : ");
                    System.out.println("ID : ");
                    String newId = sc.next();
                    System.out.println("Name : ");
                    String newName = sc.next();
                    System.out.println("Birth : ");
                    String newBirth = sc.next();
                    System.out.println("Phone number : ");
                    String newPhoneNumber = sc.next();
                    System.out.println("1. Experience, 2. Fresher, 3. Intern");
                    System.out.println("Enter type of employees :");
                    int newType = sc.nextInt();
                    System.out.println("Email : ");
                    String newMail = sc.next();
                    if (newType == 1) {
                        System.out.println("Enter year Experience : ");
                        int yearExperience = sc.nextInt();
                        System.out.println("Enter pro skill : ");
                        String proSkill = sc.next();
                        Experience experienceEmployee = new Experience(newId, newName, newBirth, newPhoneNumber, newMail, yearExperience, proSkill);
                        fileData.updateEmployee(newId, experienceEmployee);
                    } else if (newType == 2) {
                        System.out.println("Enter graduation date : ");
                        String graduation_date = sc.next();
                        System.out.println("Enter graduation rank : ");
                        String graduation_rank = sc.next();
                        System.out.println("Enter your University : ");
                        String education = sc.next();
                        Fresher fresher = new Fresher(newId, newName, newBirth, newPhoneNumber, newMail, graduation_date, graduation_rank, education);
                        fileData.updateEmployee(newId, fresher);
                    } else if (newType == 3) {
                        System.out.println("Enter majors : ");
                        String major = sc.next();
                        System.out.println("Enter semester : ");
                        String semester = sc.next();
                        System.out.println("Enter your University : ");
                        String education = sc.next();
                        Intern intern = new Intern(newId, newName, newBirth, newPhoneNumber, newMail, major, semester, education);
                        fileData.updateEmployee(newId, intern);
                    }
                    break;
                case 4:
                    System.out.println("Enter ID to delete");
                    String idDelete = sc.next();
                    fileData.deleteEmployee(idDelete);
                    System.out.println("Employees list after delete: ");
                    fileData.displayAllEmployees();
                    break;
                case 5:
                    fileData.writeToCSV("employees.csv");
                    System.out.println("Write success !");
                    break;
                case 6:
                    EmployeeDatabase newFile = new EmployeeDatabase();
                    newFile.readFromCSV("employees.csv");
                    System.out.println("All Employees read from CSV:");
                    newFile.displayAllEmployees();
                    break;
                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 7.");
                    break;
            }
        } while (choice != 7);
    }
}
