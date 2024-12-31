package exercise;
import java.util.Scanner;

class Rectangle {
    public int length, width;

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + (length * width));
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}

public class exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("Enter the length of the rectangle: ");
        rect.length = input.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        rect.width = input.nextInt();

        System.out.println("=================================");
        System.out.println("Rectangle Details:");
        rect.display();
    }
}
