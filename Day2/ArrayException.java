package Day2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayException {
    
    public String getPriceDetails() {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        
        try {
            // Get the size of the array
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            
            // Declare the array to store price details
            int[] prices = new int[size];
            
            // Get the price details
            System.out.println("Enter the price details:");
            for (int i = 0; i < size; i++) {
                prices[i] = scanner.nextInt();
            }
            
            // Get the index to access
            System.out.print("Enter the index of the array element you want to access: ");
            int index = scanner.nextInt();
            
            // Return the value at the specified index
            result = "The array element is " + prices[index];
            
        } catch (ArrayIndexOutOfBoundsException e) {
            result = "Array index is out of range";
        } catch (InputMismatchException e) {
            result = "Input was not in the correct format";
        }
        
        return result;
    }

    public static void main(String[] args) {
        ArrayException arrayException = new ArrayException();
        String result = arrayException.getPriceDetails();
        System.out.println(result);
    }
}
