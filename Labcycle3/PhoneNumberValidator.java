import java.util.Scanner;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class GradeValidator {
    public static void validateGrade(char grade) throws InvalidGradeException {
        if (grade < 'A' || grade > 'F') {
            throw new InvalidGradeException("Grade must be between 'A' and 'F'.");
        }
    }

    public static void main(String[] args) {
        char grade;
        Scanner scanner = new Scanner(System.in);

        boolean valid = false;
        while (!valid) {
            System.out.print("Enter student's grade: ");
            grade = scanner.next().charAt(0);

            try {
                validateGrade(grade);
                System.out.println("Grade is valid.");
                valid = true;
            } catch (InvalidGradeException e) {
                System.out.println("Invalid Grade: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        scanner.close();
    }
}

    }
}

public class PhoneNumberValidator {
    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must have exactly 10 digits.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter your phone number: ");
            String phoneNumber = scanner.nextLine();

            try {
                validatePhoneNumber(phoneNumber);
                System.out.println("Phone number is valid.");
                valid = true;
            } catch (InvalidPhoneNumberException e) {
                System.out.println("Invalid Phone Number: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        scanner.close();
    }
}
