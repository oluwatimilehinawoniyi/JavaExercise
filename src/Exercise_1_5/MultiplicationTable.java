package Exercise_1_5;

// Create a program to print the multiplication table of a number.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = scanner.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        scanner.close();
    }
}
