package org.example;

import java.util.*;

public class Util {
    // Зчитує ім'я для пошуку вводу від користувача
    public static String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        return scanner.nextLine();
    }

    // Рахує кількість входжень кожного імені в список
    public static Map<String, Integer> countNames(List<String> names) {
        Map<String, Integer> nameCountMap = new HashMap<>();
        names.forEach(name -> nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1));
        return nameCountMap;
    }

    // Шукає ім'я у мапі з підрахунком кількості входжень
    public static StringBuilder searchName() {
        // Отримання мапи з підрахунком кількості імен
        Map<String, Integer> nameCountMap = countNames(DataProvider.thirdRecord());

        // Зчитування імені для пошуку вводу від користувача
        String name = enterName();

        // Отримання кількості входжень імені у мапі
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

