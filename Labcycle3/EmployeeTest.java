import java.util.Scanner;

abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full-time employee name: ");
        String ftName = scanner.nextLine();
        System.out.print("Enter full-time employee ID: ");
        int ftId = scanner.nextInt();
        System.out.print("Enter full-time employee monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.print("Enter part-time employee name: ");
        String ptName = scanner.nextLine();
        System.out.print("Enter part-time employee ID: ");
        int ptId = scanner.nextInt();
        System.out.print("Enter part-time employee hourly rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Enter part-time employee hours worked: ");
        int hoursWorked = scanner.nextInt();

        Employee fullTime = new FullTimeEmployee(ftName, ftId, monthlySalary);
        Employee partTime = new PartTimeEmployee(ptName, ptId, hourlyRate, hoursWorked);

        System.out.println("\nEmployee Details:");
        System.out.println("Full-time Employee: " + fullTime.name + " (ID: " + fullTime.id + "), Salary: " + fullTime.calculateSalary());
        System.out.println("Part-time Employee: " + partTime.name + " (ID: " + partTime.id + "), Salary: " + partTime.calculateSalary());

        scanner.close();
    }
}
