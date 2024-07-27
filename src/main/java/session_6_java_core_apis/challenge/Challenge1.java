package session_6_java_core_apis.challenge;

//Stringbuilder reverse string

public class Challenge1 {

    public static StringBuilder reverser(String string) {
        var reversed = new StringBuilder(string);
        return reversed.reverse();
      /* sau
        for (int i = string.length()-1; i >= 0; i--)
                   reversed = reversed.append(string.charAt(i));

        return reversed;*/
    }
}

