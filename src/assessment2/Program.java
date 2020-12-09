package assessment2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String number = input.next();

        Integer result = new DigitRearrange().rearrangeDigitsToMakeHighestNumber(Integer.parseInt(number));
        System.out.println("The output is " + result);
    }
}
