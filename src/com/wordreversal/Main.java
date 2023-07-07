package com.wordreversal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the word that will be reversed: ");
        String word = input.nextLine();

        System.out.println("Word (Right Order): " + word);
        System.out.println("Word (Reversed): " + reverseWord(word));


    }

    public static StringBuilder reverseWord(String word){
        StringBuilder reversedWord = new StringBuilder(word);

        return reversedWord.reverse();
    }


}
