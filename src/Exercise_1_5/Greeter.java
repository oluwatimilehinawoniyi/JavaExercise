package Exercise_1_5;

/*
 A simple program that takes a name from the CLI
 and greets the person!
*/

import java.util.Scanner;

public class Greeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there, what is your name?");

        String name = scanner.nextLine();

        System.out.println("Welcome " + name + ", nice to have you here!");

        scanner.close();
    }
}
