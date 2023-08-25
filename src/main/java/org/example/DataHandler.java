package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataHandler {
    public static String correctWord(String word) {
        return word.replace('b', 'o');
    }

    public static List<String> correct(List<String> words) {
        return words.stream().map(DataHandler::correctWord).collect(Collectors.toList());
    }

    public static List<String> removeWord(List<String> words, String target) {
        return words.stream().filter(word -> !word.equals(target)).collect(Collectors.toList());
    }

    public static StringBuilder numList(List<String> words) {
        StringBuilder result = new StringBuilder();
        IntStream.range(0, words.size()).forEach(i ->
                result.append(i + 1).append(") ").append(words.get(i)).append("\n"));
        return result;
    }
}

