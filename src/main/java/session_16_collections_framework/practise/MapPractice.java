package session_16_collections_framework.practise;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> students = initializaMap();
        System.out.println("Alice's age is " + retrieveValue(students, "Alice"));
        updateMap(students, "Bob", 20);


        for(Map.Entry<String, Integer> entry : students.entrySet()){
            System.out.println("Student name is "+ entry.getKey());
            System.out.println("Student age is "+ entry.getValue());
        }
}
    public static void updateMap(Map<String, Integer> map, String key, int value) {
        map.put(key, value);
    }


    public static int retrieveValue(Map<String, Integer> map, String key){
        return map.get(key);

    }



    public static Map<String, Integer> initializaMap(){
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice",21);
        students.put("John",23);
        students.put("Bob",23);

        return students;
    }
}
