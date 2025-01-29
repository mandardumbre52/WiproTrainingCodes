package Day2;

import java.util.Scanner;

class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;

    // Getters and Setters
    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets > 0) {
            Ticket.availableTickets = availableTickets;
        } else {
            System.out.println("Invalid available tickets count");
        }
    }

    public int calculateTicketCost(int nooftickets) {
        if (nooftickets > availableTickets) {
            return -1;
        }
        availableTickets -= nooftickets;
        return nooftickets * price;
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no of bookings: ");
        int noOfBookings = scanner.nextInt();

        System.out.print("Enter the available tickets: ");
        Ticket.setAvailableTickets(scanner.nextInt());

        for (int i = 0; i < noOfBookings; i++) {
            Ticket ticket = new Ticket();

            System.out.print("Enter the ticketid: ");
            ticket.setTicketid(scanner.nextInt());

            System.out.print("Enter the price: ");
            ticket.setPrice(scanner.nextInt());

            System.out.print("Enter the no of tickets: ");
            int nooftickets = scanner.nextInt();

            System.out.println("\nAvailable tickets: " + Ticket.getAvailableTickets());
            int totalAmount = ticket.calculateTicketCost(nooftickets);

            if (totalAmount == -1) {
                System.out.println("Tickets not available");
            } else {
                System.out.println("Total amount: " + totalAmount);
                System.out.println("Available tickets after booking: " + Ticket.getAvailableTickets());
            }
            System.out.println();
        }
        scanner.close();
    }
}
