package session_19_streams.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExemple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Whick", "Jack");

        List<String> upperCaseNames =names.stream()
                .map(name->name.toUpperCase())
                .toList();

        System.out.println(upperCaseNames);
    }
}
