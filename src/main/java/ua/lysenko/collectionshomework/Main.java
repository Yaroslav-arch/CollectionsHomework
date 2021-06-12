package ua.lysenko.collectionshomework;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        StringUtils stringUtils = new StringUtils();

        List<String> strings = new ArrayList<>();
        strings.add("Batman");
        strings.add("Wonder Woman");
        strings.add("BatCyborgman");
        strings.add("Aquaman");

        String longestWord = stringUtils.getLongestWord(strings);
    }
}
