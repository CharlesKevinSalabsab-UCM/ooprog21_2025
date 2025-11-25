import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        String predefinedString = "Carmen";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String userInput = scanner.nextLine();

        if (userInput.equals(predefinedString)) {
            System.out.println(predefinedString + " equals " + userInput);
        } else {
            System.out.println(predefinedString + " does not equal " + userInput);
        }

        scanner.close();
    }
}
