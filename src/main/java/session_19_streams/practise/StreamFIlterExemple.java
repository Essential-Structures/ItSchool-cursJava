package session_19_streams.practise;

import java.util.Arrays;
import java.util.List;

public class StreamFIlterExemple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Whick", "Jack");

        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(name -> System.out.println(name));
    }
}
