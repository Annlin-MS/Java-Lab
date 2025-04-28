import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class PasswordValidator {
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }

        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Password must contain at least one number.");
        }

        if (!password.matches(".*[\\{\\$#&\\)].*")) {
            throw new InvalidPasswordException("Password must contain at least one special character ({ $ # & )).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            try {
                validatePassword(password);
                System.out.println("Password is valid.");
                isValid = true;
            } catch (InvalidPasswordException e) {
                System.out.println("Invalid Password: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        scanner.close();
    }
}
