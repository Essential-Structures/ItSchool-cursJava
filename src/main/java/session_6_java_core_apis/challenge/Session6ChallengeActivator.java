package src.sesion6_Core_JAVA_APIs.challenge;

import java.util.Scanner;

public class Session6ChallengeActivator {

    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in);
        System.out.println("Challenge1: insert string to reverse");
        String string = keyboardInput.next();
        System.out.println(Challenge1.reverser(string.trim()));}
}
