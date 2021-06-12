package ua.lysenko.collectionshomework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringUtils {

    public String getLongestWord(List<String> words) {

        List<Integer> wordsSizes = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);
            wordsSizes.add(currentWord.length());

        }
        wordsSizes.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer) o1 - (Integer) o2;
            }
        });

        int maxSize = wordsSizes.get(words.size() - 1);
        return "Longest";
    }
}
