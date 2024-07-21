package src.sesion6_Core_JAVA_APIs.challenge;

//Stringbuilder reverse string

public class Challenge1 {
    private static StringBuilder reversed = null;

    public static StringBuilder reverser(String string) {
        for (int i = string.length(); i > 0; i--)
            reversed = reversed.append(string.charAt(i - 1));

        return reversed;
    }
}

