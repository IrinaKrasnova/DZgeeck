package DZ4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        String[] arr1 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "six", "seven", "eight", "nine", "ten"};
        HashSet<String> hashSet = new HashSet<>(List.of(arr1));
        System.out.println(hashSet);
        HashMap<String, Integer> number = new HashMap<>();
        for (String x : arr1) {
            number.put(x, number.getOrDefault(x, 0) + 1);
        }
        System.out.println(number);

        Phonebook book = new Phonebook();
        book.addContact("Соня", "111111");
        book.addContact("Варя", "222222");
        book.addContact("Маша", "333333");
        book.addContact("Соня", "444444");
        book.addContact("Женя", "555555");
        book.addContact("Женя", "666666");


        book.findAndPrint("Соня");
        book.findAndPrint("Женя");
        book.findAndPrint("Маша");
    }
}