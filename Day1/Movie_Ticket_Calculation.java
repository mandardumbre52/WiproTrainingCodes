package Day1;

import java.util.Scanner;

public class Movie_Ticket_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no of ticket: ");
        int numTickets = sc.nextInt();
        
        // Check for valid number of tickets
        if (numTickets < 5 || numTickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }
        
        System.out.print("Do you want refreshment (Y/N): ");
        char refreshmentChoice = sc.next().charAt(0);
        
        System.out.print("Do you have coupon code (Y/N): ");
        char couponChoice = sc.next().charAt(0);
        
        // Input the type of ticket (K for King, Q for Queen)
        System.out.print("Enter the circle (K/Q): ");
        char ticketType = sc.next().charAt(0);
        
        double ticketPrice = 0;
        
        if (ticketType == 'K' || ticketType == 'k') {
            ticketPrice = 75; // King ticket price
        } else if (ticketType == 'Q' || ticketType == 'q') {
            ticketPrice = 150; // Queen ticket price
        } else {
            System.out.println("Invalid Input");
            return;
        }
        
        // Calculate total ticket cost
        double totalCost = numTickets * ticketPrice;
        
        // refreshment cost if needed
        double refreshmentCost = (refreshmentChoice == 'Y' || refreshmentChoice == 'y') ? numTickets * 50 : 0;
        
        // the bulk booking discount (10% if more than 20 tickets)
        if (numTickets > 20) {
            totalCost = totalCost * 0.90; // 10% discount
        }
        
        // Apply the coupon discount (2%)
        if (couponChoice == 'Y' || couponChoice == 'y') {
            totalCost = totalCost * 0.98; // 2% discount
        }
        
        // Add refreshment cost
        totalCost += refreshmentCost;
        
        System.out.printf("Ticket cost: %.2f\n", totalCost);
        
        sc.close();
    }
}
