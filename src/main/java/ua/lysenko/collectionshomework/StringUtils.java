package ua.lysenko.collectionshomework;

import java.util.*;

import static java.util.Comparator.*;

public class StringUtils {

    public String getLongestWord(List<String> words) {
        int wordLength = 0;
        String longestWord = "";
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > wordLength) {
                wordLength = words.get(i).length();
                longestWord = words.get(i);
            }
        }
        return longestWord;
    }

    public List<String> getDuplicates(List<String> words) {  //another variant
        words.sort(comparingInt(String::length));
        List<String> duplicates = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j)) && !duplicates.contains(words.get(i))) {
                    duplicates.add(words.get(i));
                }
            }

        }
        return duplicates;
    }

    public List<String> getDuplicatesAnother(List<String> words) {
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            int count = Collections.frequency(words, words.get(i));
            if (count > 1 && !duplicates.contains(words.get(i))) {
                duplicates.add(words.get(i));
            }
        }
        return duplicates;
    }

}
