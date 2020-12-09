package assessment3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String number = input.next();

        Integer result = new DigitOccurrences().getNumberOfOccurrencesOfMostCommonDigit(Integer.parseInt(number));
        System.out.println("The output is " + result);
    }
}
