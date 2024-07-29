package session_16_collections_framework.challenge;

import java.util.HashSet;
import java.util.Set;

public class HashSetChallenges {
    protected static Set setToTestWith = new HashSet<String>(ArrayListChallenges.getList());

    protected static void hashSetChallenger() {
//    1. program to append the specified element to the end of a hash set. 
        setToTestWith.add("\n1. HashSet appended at end");//       2.Write a Java program to iterate through all elements in a hash list. 
//        3.Write a Java program to get the number of elements in a hash set. 
        for (Set setElement : setToTestWith) System.out.println(setElement + ", ");
//        4.Write a Java program to empty a hash set.
//        5.Write a Java program to test a hash set is empty or not. 
        Set setToEmpty = new HashSet(session_16_collections_framework.challenge.ArrayListChallenges.getList());
        System.out.println("\n4,5. Before emptying: " + setToEmpty);
        setToEmpty.isEmpty();
        setToEmpty.clear();
        System.out.println(("\nCleared set: " + setToEmpty));
        setToEmpty.isEmpty();

//        6.Write a Java program to clone a hash set to another hash set. 
//        7.Write a Java program to convert a hash set to an array. 
//        8.Write a Java program to convert a hash set to a tree set. 
//        9.Write a Java program to convert a hash set to a List/ArrayList. 
//        10.Write a Java program to compare two hash set. 
//        11.Write a Java program to compare two sets and retain elements which are same on both sets. 
//        12.Write a Java program to remove all the elements from a hash set. 


    }
}