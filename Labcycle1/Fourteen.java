import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();
        System.out.print("Enter the pattern to search: ");
        String pattern = scanner.nextLine();
        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        scanner.close();

        String modifiedString = original.replace(pattern, replacement);
        System.out.println("Modified String: " + modifiedString);
    }
}
