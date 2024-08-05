package session_16_collections_framework.challenge;

import java.util.*;

public class TreeSetChalenges {
    private static Set treeSet = new TreeSet(Arrays.asList("white", "green", "blue"));

    public static void main(String[] args) {
        // 1.Write a Java program to create a new tree set, add some colors (string) and print out the tree set. 
        treeSet.add("purple");

//2.Write a Java program to iterate through all elements in a tree set.
//3.Write a Java program to add all the elements of a specified tree set to another tree set.
        Set<String> treeSetCopy = new TreeSet<>(treeSet);
        treeSetCopy.addAll(treeSet);//test if adds duplicates

        System.out.println("treeSet via iteration: ");
        for (Object element : treeSet) System.out.print(element + " ");

        System.out.println("\ntreeSetCopy via print(): ");
        System.out.println(treeSetCopy);
        System.out.println("treeSetCopy via iteration: ");
        for (String element : treeSetCopy) System.out.print(element + " ");

//4.Write a Java program to create a reverse order view of the elements contained in a given tree set. 
       // NavigableSet treeSetReverse;
        //treeSetReverse = (NavigableSet) treeSetCopy;
        System.out.println("\nReversed treeSetCopy: ");
        for (Object element : ((NavigableSet)treeSetCopy).descendingSet())
            System.out.print(element + " ");
        System.out.println("\nCheck if treeSetCopy transformed: "+treeSetCopy);

//5.Write a Java program to get the first and last elements in a tree set. 
        System.out.println("\ntreeSetCopy smallest: "+((NavigableSet<String>) treeSetCopy).first());
        System.out.println("treeSetCopy highest: "+((NavigableSet<String>) treeSetCopy).last());

//7.Write a Java program to get the number of elements in a tree set.
        System.out.println("Length is "+treeSet.size()+" elements");

//8.Write a Java program to compare two tree sets. 
//9.Write a Java program to find the numbers less than 7 in a tree set. 
//10.Write a Java program to get the element in a tree set which is greater than or equal to the given element. 
//11.Write a Java program to get the element in a tree set which is less than or equal to the given element. 

//14.Write a Java program to retrieve and remove the first element of a tree set. 
//15.Write a Java program to retrieve and remove the last element of a tree set. 
        System.out.println("treeSetCopy is "+treeSetCopy);
        System.out.println("Last element of treeSetCopy: "+Collections.max(treeSetCopy));
        treeSetCopy.remove(Collections.max(treeSetCopy));
        System.out.println("treeSetCopy after removal of last element: "+treeSetCopy);
//16.Write a Java program to remove a given element from a tree set
        treeSet.remove("purple");
    }
}


