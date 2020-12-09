package assessment2;

public class DigitRearrange {
    public int rearrangeDigitsToMakeHighestNumber(int number) {
        int[] times = new int[10];

        while (number != 0) {
            int val = number % 10;
            times[val]++;
            number /= 10;
        }

        int largestNumber = 0;
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < times[i]; j++) {
                largestNumber = largestNumber * 10 + i;
            }
        }

        return largestNumber;
    }
}
