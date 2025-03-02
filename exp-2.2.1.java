import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerSumCalculator {

    // Method to parse a string into an Integer
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str); // Autoboxing occurs here
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null; // Return null for invalid input
        }
    }

    // Method to calculate the sum of a list of Integers
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) {
                sum += num; // Unboxing occurs here
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            Integer number = parseStringToInteger(input);
            if (number != null) {
                numbers.add(number); // Autoboxing happens here
            }
        }

        scanner.close();

        System.out.println("The sum of the list is: " + calculateSum(numbers));
    }
}
