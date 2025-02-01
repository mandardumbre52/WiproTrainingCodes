import java.util.Scanner;

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void area();
}

class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.printf("Area of Rectangle = %.0f\n", length * breadth);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.printf("Area of Circle = %.0f\n", Math.PI * radius * radius);
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.printf("Area of Triangle = %.0f\n", 0.5 * base * height);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Which shape do you want to work with? [1. Rectangle | 2. Circle | 3. Triangle]: ");
        int choice = sc.nextInt();
        sc.nextLine();  // Consume newline character

        Shape shape = null;

        if (choice == 1) {
            System.out.print("Enter color of Rectangle: ");
            String color = sc.nextLine();
            System.out.print("Enter length of Rectangle: ");
            double length = sc.nextDouble();
            System.out.print("Enter breadth of Rectangle: ");
            double breadth = sc.nextDouble();
            shape = new Rectangle(color, length, breadth);
        } else if (choice == 2) {
            System.out.print("Enter color of Circle: ");
            String color = sc.nextLine();
            System.out.print("Enter radius of Circle: ");
            double radius = sc.nextDouble();
            shape = new Circle(color, radius);
        } else if (choice == 3) {
            System.out.print("Enter color of Triangle: ");
            String color = sc.nextLine();
            System.out.print("Enter base of Triangle: ");
            double base = sc.nextDouble();
            System.out.print("Enter height of Triangle: ");
            double height = sc.nextDouble();
            shape = new Triangle(color, base, height);
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        System.out.println("=============== SHAPE SELECTED : " + shape.getClass().getSimpleName().toUpperCase() + " ===============");
        System.out.println("Color of \"" + shape.getClass().getSimpleName() + "\" = " + shape.getColor());

        System.out.print("Do you want to change the color of " + shape.getClass().getSimpleName() + " [Y/N]: ");
        if (sc.next().equalsIgnoreCase("Y")) {
            System.out.print("Enter new color: ");
            sc.nextLine();  // Consume newline character
            shape.setColor(sc.nextLine());
            System.out.println("New color of \"" + shape.getClass().getSimpleName() + "\" = " + shape.getColor());
        }

        shape.area();
        sc.close();
    }
}
