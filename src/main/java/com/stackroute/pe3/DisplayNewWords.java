package main.java.com.stackroute.pe3;

import java.lang.Class;
import java.util.Scanner;
import java.lang.String;

public class DisplayNewWords {
    public String[] isVowelRemove(String[] words) {
        if (words == null) {
            return null;
        }

        String word1[] = new String[words.length];
        int i = 0;
        for (String word : words) {
            if (word == null) {
                word1[i++] = null;
            } else {
                word1[i++] = word.replaceAll("[aeiou]", "");
               // System.out.println(word);
            }

        }
        return word1;
    }
}

