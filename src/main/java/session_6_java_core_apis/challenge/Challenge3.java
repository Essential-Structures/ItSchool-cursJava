package main.java.session_6_java_core_apis.challenge;

import java.util.List;

//stringBuilder concatenate
public class Challenge3 {
    private static StringBuilder result = new StringBuilder();//??doar la primitive merge sa le declar fara sa le instantiez?

    public static StringBuilder concatenator(List<String> listToConcatenate) {
        for (var listElement : listToConcatenate) result.append(listElement);
        return result;

    }
}
