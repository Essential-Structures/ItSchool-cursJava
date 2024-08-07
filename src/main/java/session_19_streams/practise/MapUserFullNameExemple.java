package session_19_streams.practise;

import java.util.Arrays;
import java.util.List;

public class MapUserFullNameExemple {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Pulea", "Dung", 38),
                new User("Neapulea", "Ion", 18),
                new User("Alexandru", "Lapusneanu", 41)
        );

        //map users according to full names, into a list

 //       List<String> fullNames = users.stream()
   //             .map (name->name.getName()+ " " + surName.getSurname() );
    }
}
