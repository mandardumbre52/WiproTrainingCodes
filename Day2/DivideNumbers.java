package Day2;

import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num2 != 0) {
            int result = num1 / num2;
            System.out.println("The answer is " + result + ". Thanks for using the application.");
        } else {
            System.out.println("Division by zero is not allowed. Please try again.");
        }
    }
}
