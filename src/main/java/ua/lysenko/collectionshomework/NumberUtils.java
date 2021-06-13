package ua.lysenko.collectionshomework;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        return sum;
    }

    public List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int x = numbers.get(i) % 2 == 1
                    ? numbers.get(i) * 2
                    : numbers.get(i);
            result.add(x);
        }
        return result;
    }
}
