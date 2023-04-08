package homework5;

import java.util.*;

public class repeatName {
    public static void repeatNameAndCount() {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Иван Иванов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Иван Иванов", "Мария Рыкова",
                "Анна Крутова", "Марина Лугова", "Анна Владимирова", "Петр Лыков",
                "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов"
        ));
        Map<String, Integer> counts = new HashMap<>();
        for (String emp : names) {
            counts.put(emp, counts.getOrDefault(emp, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(counts.entrySet());
        Collections.sort(list, Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : list) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}



