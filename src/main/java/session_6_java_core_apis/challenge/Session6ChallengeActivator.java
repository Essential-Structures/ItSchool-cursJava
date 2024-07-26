package main.java.session_6_java_core_apis.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Session6ChallengeActivator {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Challenge1: \n insert stringToTestWith to reverse");
        String stringToTestWith = keyboardInput.nextLine();


        /* Challege1 - reverse string*/
        System.out.println("Reversed string is " + Challenge1.reverser(stringToTestWith.trim()));


        /*Challenge2 - is it palindrome?*/
        System.out.println("Challenge2 - is it palindrome?");
        System.out.println(Challenge2.isPalindrome(stringToTestWith));


        /*Challenge3 - concat list of strings*/
        System.out.println("Challenge3 - concat list of strings");
        List<String> stringlist = new ArrayList<>();
        stringlist.add("11fgr1");
        stringlist.add("222sdf2");
        stringlist.add("33333");
        stringlist.add("4a444g44");
        stringlist.add("5t555");

        System.out.println("Concatenated: " + Challenge3.concatenator(stringlist));
    }
}
