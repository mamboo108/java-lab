class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor for Employee
    public Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
}

// Officer class inherits from Employee
class Officer extends Employee {
    String specialization;
    String department;

    // Constructor for Officer
    public Officer(String name, int age, String phoneNumber, String address, double salary, String specialization,String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    // Method to print Officer's details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Specialization: " + specialization);
        System.out.println("Department" + department);
    }
}

// Manager class inherits from Employee
class Manager extends Employee {
    String department;
    String speacial;

    // Constructor for Manager
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department,String speacial) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
        this.speacial= speacial;
    }

    // Method to print Manager's details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Special: "+speacial);
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Officer officer = new Officer("John", 35, "1234567890", "New York", 50000, "Software Development","new");
        Manager manager = new Manager("Alice", 40, "0987654321", "California", 75000, "HR","new");

        System.out.println("Officer Details:");
        officer.printDetails();

        System.out.println("\nManager Details:");
        manager.printDetails();
    }
}
