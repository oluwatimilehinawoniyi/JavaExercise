package Exercise_1_5;

// Write a program that checks if a number is even or odd

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to know if it's odd or even:");

        int num = scanner.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is an even number!");
        else
            System.out.println(num + " is an odd number!");

        scanner.close();
    }
}
