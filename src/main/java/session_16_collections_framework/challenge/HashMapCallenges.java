package session_16_collections_framework.challenge;

import java.util.*;

public class HashMapCallenges {
    public static void main(String[] args) {
// 1.Write a Java program to associate the specified value with the specified key in a HashMap.
        Map<String, Integer> map = new HashMap<>();
        map.put("group 1",13);
        map.put("group 2",8);
        map.put("group 3",3);

//10.Write a Java program to get the value of a specified key in a map.
        System.out.println("Group 1 has "+map.get("group 1")+" members");

//2.Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("Map has "+map.size()+" elements");

//3.Write a Java program to copy all of the mappings from the specified map to another map.
        Map mapCopy= new HashMap<>(map);

//4.Write a Java program to remove all of the mappings from a map.
        //map.clear();
//5.Write a Java program to check whether a map contains key-value mappings (empty) or not.
        //map.isEmpty();
//6.Write a Java program to get a shallow copy of a HashMap instance.
      //  map.putAll();

//7.Write a Java program to test if a map contains a mapping for the specified key.
        System.out.print("Does map contain mapping for key 'group 3'? "+ map.containsKey("group 3"));
        System.out.print(" mapped to value "+map.get("group 3"));

//8.Write a Java program to test if a map contains a mapping for the specified value.
        //map.containsValue()

//9.Write a Java program to create a set view of the mappings contained in a map.
        System.out.println("\nmapCopy view as set: "+mapCopy.entrySet());

//11.Write a Java program to get a set view of the keys contained in this map.
        System.out.println("mapCopy keys viewed as set: "+mapCopy.keySet());

//12.Write a Java program to get a collection view of the values contained in this map.
    Collection mapAsSet = new HashSet();
        for(Map.Entry<String, Integer> mapElement : mapCopy.entrySet())
            {mapAsSet.add(mapElement.getValue());}
        System.out.println("Map values viewed as set: "+mapAsSet);
    }
}
