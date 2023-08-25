package org.example;

import java.util.*;

public class Util {
    public static String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        return scanner.nextLine();
    }

    public static Map<String, Integer> countNames(List<String> names) {
        Map<String, Integer> nameCountMap = new HashMap<>();
        names.forEach(name -> nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1));
        return nameCountMap;
    }

    public static StringBuilder searchName() {
        Map<String, Integer> nameCountMap = countNames(DataProvider.thirdRecord());
        String name = enterName();
        int count = nameCountMap.getOrDefault(name, 0);
        StringBuilder stringBuilder = new StringBuilder();

        if (count > 0) {
            stringBuilder.append(String.format("Name: %s%nCount: %d", name, count));
        } else {
            stringBuilder.append("Name not found.");
        }
        return stringBuilder;
    }
}

