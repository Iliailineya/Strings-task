package org.example;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<String> firstRecord(){
        List<String> words = new ArrayList<>();
        words.add("brange");
        words.add("plum");
        words.add("tomato");
        words.add("onibn");
        words.add("grape");
        return words;
    }
    public static List<String> secondRecord(){
        List<String> words = new ArrayList<>();
        words.add("orange");
        words.add("plum");
        words.add("tomato");
        words.add("onion");
        words.add("grape");
        words.add("onion");
        return words;
    }

    public static List<String> thirdRecord(){
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Alice");
        names.add("Tom");
        names.add("Lucy");
        names.add("Bob");
        names.add("Lisa");
        return names;
    }
}
