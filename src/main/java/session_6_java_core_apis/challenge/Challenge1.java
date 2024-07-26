package main.java.session_6_java_core_apis.challenge;

//Stringbuilder reverse string

public class Challenge1 {
    static StringBuilder reversed=new StringBuilder();

    public static StringBuilder reverser(String string) {
        for (int i = string.length()-1; i >= 0; i--)
            reversed = reversed.append(string.charAt(i));

        return reversed;
    }
}

