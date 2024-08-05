package session_19_streams.practise;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupBy_exemple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Whick", "Jack", "Bill");

        Map<Character, List<String>> groupByFirstLetter =
                names.stream()
                        .collect(Collectors.groupingBy(name->name.charAt(0)));

        System.out.println(groupByFirstLetter);
    }
}
