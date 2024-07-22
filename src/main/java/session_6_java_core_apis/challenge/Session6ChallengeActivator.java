package session_6_java_core_apis.challenge;

import java.util.List;
import java.util.Scanner;

public class Session6ChallengeActivator {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Challenge1: \n insert string to reverse");
        String string = keyboardInput.nextLine();
        /* Challege1*/
        System.out.println(Challenge1.reverser(string.trim()));
        /*Challenge2*/
        System.out.println("O fi palindrom? " + Challenge2.isPalindrome(string));
        /*Challenge3*/
        List<String> stringlist = new List<String>();
        stringlist.add("11fgr1");
        stringlist.add("222sdf2");
        stringlist.add("33333");
        stringlist.add("4a444g44");
        stringlist.add("5t555");
        System.out.println("Concatenated: "+Challege4.concat());
    }
}
