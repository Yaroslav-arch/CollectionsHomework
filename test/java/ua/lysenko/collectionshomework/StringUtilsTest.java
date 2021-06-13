package ua.lysenko.collectionshomework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    private StringUtils stringUtils = new StringUtils();
    List<String> strings = new ArrayList<>();

    {
        strings.add("Superman");
        strings.add("Superman");
        strings.add("Wonder woman");
        strings.add("Cyborg");
        strings.add("Cyborg");
        strings.add("Cyborg");
        strings.add("Aquamen");
    }

    @Test
    void getLongestWord() {
        String longestWord = stringUtils.getLongestWord(strings);

        assertEquals("Wonder woman", longestWord);
    }

    @Test
    void getDuplicates() {
        List<String> duplicates = stringUtils.getDuplicates(strings);
        assertEquals(2, duplicates.size());
        assertTrue(duplicates.contains("Cyborg"));
        assertTrue(duplicates.contains("Superman"));
    }

    @Test
    void getDuplicatesAnother() {
        List<String> duplicates = stringUtils.getDuplicates(strings);
        assertEquals(2, duplicates.size());
        assertTrue(duplicates.contains("Cyborg"));
        assertTrue(duplicates.contains("Superman"));
    }
}