import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        System.out.print("Enter any positive number: ");
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            
            if (num >= 0) {
                int sum = calculateSumOfDigits(num);
                System.out.println("Sum of the digits: " + sum);
            } else {
                System.out.println("Please enter a positive number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        sc.close();
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
