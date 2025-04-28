class Person {
    String name;
    String gender;
    String address;
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
    String companyName;
    String qualification;
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
    String subject;
    String department;
    int teacherId;

    public Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    public void displayDetails() {
        System.out.println("Teacher ID: " + teacherId);
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
        System.out.println();
    }
}

public class TeacherTest {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];

        teachers[0] = new Teacher("Emma", "Female", "123 Street, NY", 35, 101, "ABC School", "MSc", 50000, "Math", "Science", 201);
        teachers[1] = new Teacher("David", "Male", "456 Avenue, LA", 40, 102, "XYZ Institute", "MA", 55000, "English", "Arts", 202);
        teachers[2] = new Teacher("Sophia", "Female", "789 Boulevard, SF", 38, 103, "LMN College", "PhD", 60000, "Physics", "Science", 203);

        for (Teacher teacher : teachers) {
            teacher.displayDetails();
        }
    }
}
