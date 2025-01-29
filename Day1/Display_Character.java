package Day1;

import java.util.Scanner;

public class Display_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store the 4 numbers
        int[] numbers = new int[4];

        System.out.println("Enter 4 Numbers:");
        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();  // Taking 4 numbers as input
        }

        // Display the corresponding characters for each number
        for (int i = 0; i < 4; i++) {
            char character = (char) numbers[i];  // Convert number to character
            System.out.println(numbers[i] + "-" + character);
        }

        sc.close(); 
    }
}
