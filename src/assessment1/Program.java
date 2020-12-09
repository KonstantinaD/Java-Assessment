package assessment1;

import java.text.ParseException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day: ");
        String day = input.next();

        System.out.println("Enter a month: ");
        String month = input.next();

        System.out.println("Enter a year: ");
        String year = input.next();

        String result = new DateConversion().convertDate(day, month, year);

        System.out.println("The formatted date is " + result);
    }
}
