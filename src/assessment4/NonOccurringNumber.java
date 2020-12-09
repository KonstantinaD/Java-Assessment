package assessment4;

import java.util.HashSet;
import java.util.Set;

public class NonOccurringNumber {
    public int getSmallestMissingPositiveNumber(Integer[] numbers) {
        int arrayLength = numbers.length;
        Set<Integer> set = new HashSet<>();
        for (int a : numbers) {
            if (a > 0) {
                set.add(a);
            }
        }

        for (int i = 1; i <= arrayLength + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        
        return arrayLength + 1;
    }
}
