package com.company;

import java.util.*;

public class Main {
// Определяем являются ли 2 слова анаграммой
    public static void main(String[] args) {
        System.out.println("Ведите 2 слова через пробел: ");
        boolean rezalt = false;
        Scanner scanner = new Scanner(System.in);
        StringBuilder word1 = new StringBuilder(scanner.next().toLowerCase());
        StringBuilder word2 = new StringBuilder(scanner.next().toLowerCase());
        scanner.close();

        rezalt = analyzer(word1).equals(analyzer(word2));

        System.out.println(rezalt);
    }

     static Map<Character, Integer> analyzer(StringBuilder word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            int numChar = 1;
            char charW = word.charAt(i);
            if (!map.isEmpty()) {

                Iterator<Map.Entry<Character, Integer>> iterChar = map.entrySet().iterator();
                while (iterChar.hasNext()) {
                    Map.Entry<Character, Integer> ent = iterChar.next();
                    if (ent.getKey().equals(charW)) {
                        numChar += ent.getValue();
                        iterChar.remove();
                    }
                }
            }
            map.put(charW, numChar);
        }
        return map;
    }
}
