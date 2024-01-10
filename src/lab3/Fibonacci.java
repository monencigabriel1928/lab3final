package lab3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numărul N: ");
        int N = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println("Șirul lui Fibonacci până la " + N + " este:");
        while (a <= N) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        scanner.close();
    }
}