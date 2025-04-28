import java.util.Scanner;

class Person {
    String name, gender, address;
    int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName, qualification;
    double salary;

    public Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject, department;
    int teacherId;

    public Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary,
                   String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    public void display() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }
}

public class TeacherTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Company Name: ");
            String companyName = scanner.nextLine();

            System.out.print("Qualification: ");
            String qualification = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Subject: ");
            String subject = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Teacher ID: ");
            int teacherId = scanner.nextInt();
            scanner.nextLine(); 

            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
        }

        System.out.println("\n--- All Teacher Details ---");
        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        scanner.close();
    }
}
