package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int size = scanner.nextInt();
        scanner.nextLine();
        double[] numbers = new double[size];
        System.out.println("Wprowadź " + size + " liczb:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
        double powerSum = 0;
        for (double number : numbers) {
            powerSum = powerSum + Math.pow(number, 2);
        }
        System.out.println("Suma kwadratów wprowadzonych liczb to " + powerSum);
    }
}
