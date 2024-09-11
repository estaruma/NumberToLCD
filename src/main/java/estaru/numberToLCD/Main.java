package estaru.numberToLCD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("enter number: ");
        String number = scanner.nextLine();

        LCDNumber.LCDNumber(number);
    }
}