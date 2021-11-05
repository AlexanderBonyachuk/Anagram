package com.company;

import java.util.*;

public class Main {
// Определяем являются ли 2 слова анаграммой
    public static void main(String[] args) {
        System.out.println("Ведите 2 слова через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next().toLowerCase();
        String word2 = scanner.next().toLowerCase();
        scanner.close();
        System.out.println(analyzer(word1).equals(analyzer(word2)));
    }
// метод выдающий HashMap-у с количеством букв в слове
     static Map<Character, Integer> analyzer(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            int numChar = 1;
            char charW = word.charAt(i);
            if (map.containsKey(charW)) {
                numChar += map.get(charW);
            }
            map.put(charW, numChar);
        }
        return map;
    }
}