package session_6_java_core_apis.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Session6ChallengeActivator {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Challenge1: \n insert stringToTestWith ");
        String stringToTestWith = keyboardInput.nextLine();


        /* Challege1 - reverse string*/
        System.out.println("Reversed string is " + Challenge1.reverser(stringToTestWith.trim()));


        /*Challenge2 - is it palindrome?*/
        System.out.println("Challenge2 - is it palindrome?" + Challenge2.isPalindrome(stringToTestWith));


        /*Challenge3 - concat list of strings*/
        System.out.println("Challenge3 - concat list of strings");
        List<String> stringlist = new ArrayList<>();
        stringlist.add("11fgr1");
        stringlist.add("222sdf2");
        stringlist.add("33333");
        stringlist.add("4a444g44");
        stringlist.add("5t555");

        System.out.println("Concatenated: " + Challenge3.concatenator(stringlist));

        //Challenge 4 -remove vowels
        System.out.println("Devoweled string is "+ Challege4.devowler(stringToTestWith));

        //Challange5 - capitalize words
        System.out.println("String with capitalied words is: " + Challenge5.wordCapitalizer(stringToTestWith));


        //Challenge6 - substring replace
        System.out.println("Challenge6-substring after replace "+ Challenge6.substrigReplacer());
    }
}
