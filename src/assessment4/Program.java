package assessment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter a number: ");
        String number = input.next();
        numbers.add(Integer.parseInt(number));

        System.out.println("Enter a number: ");
        String number1 = input.next();
        numbers.add(Integer.parseInt(number1));

        System.out.println("Enter a number: ");
        String number2 = input.next();
        numbers.add(Integer.parseInt(number2));

        System.out.println("Enter a number: ");
        String number3 = input.next();
        numbers.add(Integer.parseInt(number3));

        Integer result = new NonOccurringNumber().getSmallestMissingPositiveNumber(numbers.toArray(new Integer[0]));
        System.out.println("The output is " + result);
    }
}
