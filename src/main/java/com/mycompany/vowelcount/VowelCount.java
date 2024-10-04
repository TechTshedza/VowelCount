/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;

/**
 *
 * @author Muthivhi Tshedza
 */
public class VowelCount {

    public static void main(String[] args) {
               String sentence = "Hello world, my name is Tshedza and I am a student at Rosebank college";
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String sentence) {
        int count = 0;
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
