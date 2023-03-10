/**
 *
 * @author Samuel Theiss
 * @author Trevor Hartman
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();
        sc.nextLine();

        int sum = 0;

        for (int count = 0; count <= num; count++) {
            sum += count;
        }

        System.out.println("\nThe sum is " + sum);
    }

    public static void rangeSum() {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.print("\nEnter a number: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        int start;
        int end;
        int sum = 0;

        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }

        for (int count = start; count <= end; count++) {
            sum += count;
        }

        System.out.println("\nSum is " + sum);
    }

    public static void factorial() {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();
        sc.nextLine();

        int product = 1;

        for (int count = 1; count <= num; count++) {
            product = product * count;
        }

        System.out.println("The product is " + product);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
