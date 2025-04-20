package guvitask2qn4;


public class Employee extends Person2 {
    String employeeID;
    double salary;

    // Constructor with super() to initialize Person2
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Correct usage of super
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Display employee info
    void displayInfo() {
        System.out.println("Employee Details:");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary     : ₹" + salary);
    }
}