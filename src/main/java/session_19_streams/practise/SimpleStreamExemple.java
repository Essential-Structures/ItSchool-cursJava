package session_19_streams.practise;

import java.util.Arrays;
import java.util.List;

public class SimpleStreamExemple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Whick", "Jack");
        names.stream().forEach(n->System.out.println(n));

    }
}

