package ua.lysenko.collectionshomework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberUtilsTest {
    NumberUtils numberUtils = new NumberUtils();

    List<Integer> numbers = new ArrayList<>();

    {
        numbers.add(2);
        numbers.add(5);
        numbers.add(12);
    }

    @Test
    void getSum() {
        int sum = numberUtils.getSum(numbers);
        assertEquals(19, sum);
    }

    @Test
    void multiplyOddNumber() {
        List<Integer> integers = numberUtils.multiplyOddNumber(numbers);
        assertEquals(List.of(2, 10, 12), integers);
    }
}