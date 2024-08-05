package session_19_streams.practise;

import java.util.Arrays;
import java.util.List;

public class ComplexStreamExemple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Whick", "Jack", "Bill");

        //filter elements starting with 'j'
        //toUppercase
        //sort
        //collect

        List<?> resultList = names.stream()
                .filter(name->name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(resultList);
    }
}
