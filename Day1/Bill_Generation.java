package Day1;

import java.util.Scanner;

public class Bill_Generation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pizzaPrice = 100.00;
        double puffsPrice = 20.00;
        double coolDrinkPrice = 10.00;

        System.out.print("Enter the number of pizzas bought: ");
        int pizzas = sc.nextInt();
        System.out.print("Enter the number of puffs bought: ");
        int puffs = sc.nextInt();
        System.out.print("Enter the number of cool drinks bought: ");
        int coolDrinks = sc.nextInt();

        double pizzaCost = pizzas * pizzaPrice;
        double puffsCost = puffs * puffsPrice;
        double coolDrinksCost = coolDrinks * coolDrinkPrice;

        double total = pizzaCost + puffsCost + coolDrinksCost;

        System.out.println("\nBill Details");
        System.out.println("----------------------------------------------------");
        System.out.println("Item            Price   Quantity   Cost");
        System.out.println("----------------------------------------------------");
        System.out.printf("Pizza           %.2f     %d         %.2f\n", pizzaPrice, pizzas, pizzaCost);
        System.out.printf("Puffs           %.2f     %d         %.2f\n", puffsPrice, puffs, puffsCost);
        System.out.printf("Cool Drinks     %.2f     %d         %.2f\n", coolDrinkPrice, coolDrinks, coolDrinksCost);
        System.out.println("----------------------------------------------------");
        System.out.printf("Total Cost:                     %.2f\n", total);
        System.out.println("----------------------------------------------------");
        System.out.println("ENJOY THE SHOW!!!");

        sc.close();
    }
}
