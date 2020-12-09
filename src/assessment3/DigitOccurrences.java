package assessment3;

public class DigitOccurrences {
    public int getNumberOfOccurrencesOfMostCommonDigit(int number) {
        String num = Integer.toString(number);
        int[] freqArray = new int[10];
        // initialize the frequency array with zeros
        for (int k = 0; k < 9; k++) {
            freqArray[k] = 0;
        }

        //loop through our number string and count frequency of each digit
        for (int i = 0; i < num.length(); i++) {
            switch (num.charAt(i)) {
                case '0':
                    freqArray[0]++;
                    break;
                case '1':
                    freqArray[1]++;
                    break;
                case '2':
                    freqArray[2]++;
                    break;
                case '3':
                    freqArray[3]++;
                    break;
                case '4':
                    freqArray[4]++;
                    break;
                case '5':
                    freqArray[5]++;
                    break;
                case '6':
                    freqArray[6]++;
                    break;
                case '7':
                    freqArray[7]++;
                    break;
                case '8':
                    freqArray[8]++;
                    break;
                case '9':
                    freqArray[9]++;
                    break;
            }
        }
        int countOfMostCommonDigit = freqArray[0];
        for (int j = 1; j < 9; j++) {
            if (freqArray[j] > countOfMostCommonDigit) {
                countOfMostCommonDigit = freqArray[j];
            }
        }

        return countOfMostCommonDigit;
    }
}
