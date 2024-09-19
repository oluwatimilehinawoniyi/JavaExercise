package Exercise_1_5;

/* Write a program that finds the largest among three numbers given from the cli, using if-else.

    Example:
        run: java LargestAmongstThreeNums.java 1 2 3
*/

public class LargestAmongstThreeNums {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Three numbers have to be provided");
            return;
        }

        int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]), num3 = Integer.parseInt(args[2]);

        if (num1 > num2 && num1 > num3)
            System.out.println(num1 + " is greater than " + num2 + " and " + num3);
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater than " + num1 + " and " + num3);
        } else
            System.out.println(num3 + " is greater than " + num1 + " and " + num2);
    }
}
