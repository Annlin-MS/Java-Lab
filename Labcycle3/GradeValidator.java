import java.util.Scanner;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class GradeValidator {
    public static void validateGrade(char grade) throws InvalidGradeException {
        grade = Character.toUpperCase(grade); // Convert to uppercase to handle lowercase input
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
