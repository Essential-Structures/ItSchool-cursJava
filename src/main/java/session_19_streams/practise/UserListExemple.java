package session_19_streams.practise;

import java.util.List;
import java.util.Arrays;

public class UserListExemple {
    public static void main(String[] args) {
        List<User> users =Arrays.asList(
                new User("Pulea", "Dung", 38),
                new User("Neapulea", "Ion", 18),
                new User("Alexandru", "Lapusneanu", 41)
        );

        users.forEach(System.out::println);
        users.stream().forEach(System.out::println);
    }
}
