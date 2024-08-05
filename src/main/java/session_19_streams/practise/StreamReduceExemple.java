package session_19_streams.practise;

import java.util.*;

public class StreamReduceExemple {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,7,9,5,4,5,6,8,8);

        int sum = numbers.stream()
                .reduce(0,Integer::sum);

        System.out.println("Sum of numbers: "+sum);
    }
}
