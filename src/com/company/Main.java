package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        String max_word = "";
        for (String word : words) {
            if (word.length() > max_word.length()) {
                max_word = word;
            }
        }
        System.out.println("The longest word: " + max_word);
    }
}
