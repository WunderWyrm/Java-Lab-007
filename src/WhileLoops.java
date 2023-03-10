/**
 *
 * @author Samuel Theiss
 * @author Trevor Hartman
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {

        Scanner sc = new Scanner(System.in);

        int odd = 0;
        int even = 0;
        int count = 0;

        while (count <= 10) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            sc.nextLine();

            if (num % 2 == 0) {
                even++;
            } else if (num % 2 == 1) {
                odd++;
            } else {
                System.out.println(num + " is not a valid number.");
            }

            count++;
        }

        System.out.printf("You entered %d odd numbers and %d even numbers.\n", odd, even);
    }

    public static void mean() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (count <= 10) {
            System.out.print("\nEnter a number: ");
            int num = sc.nextInt();
            sc.nextLine();

            sum += num;
            count++;

            System.out.println("\nCurrent mean is " + sum/count);
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
