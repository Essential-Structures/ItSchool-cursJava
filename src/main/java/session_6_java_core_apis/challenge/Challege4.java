package main.java.session_6_java_core_apis.challenge;

import java.util.List;

//Strings concat
public class Challege4 {
    private static StringBuilder concatenated;

    public static StringBuilder concat(List<String> stringsToConcat) {
        for (String i : stringsToConcat)
            concatenated.append(i);

        return concatenated;
    }
}
