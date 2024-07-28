package session_16_collections_framework.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayListChallenges {
    public static void main(String[] args) {

//1.create a new array list, add some colors (string) and print out the collection.
        final List<String> list = new ArrayList<>(Arrays.asList("blue", "yellow", "green", "red"));
        list.add("addedPurple");

//2. Write a Java program to iterate through all elements in a array list.
        System.out.println("\n2. ORIGINAL list items:");
        for (var listItem : list) System.out.print(listItem + ", ");

//3.Write a Java program to insert an element into the array list at the first position.
        list.add(0, "inserted on first position");
        System.out.println("\n3. Insert element of 1st position results to:\n " + list);

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("\n4. Element at specified index 2 is:\n " + list.get(2));

//5. Write a Java program to update specific array element by given element.
        System.out.println("\n5. We updated list element at index 1 with: " + list.set(1, "replaced element at index 1"));
        System.out.println("Update element at specific index 1: " + list);

//6. Write a Java program to remove the third element from a array list.
        System.out.println("\n6. We remove 3rd element: " + list.remove(2));
        System.out.println("After removal of 3rd element: \n" + list);

//7. Write a Java program to search an element in a array list.
        System.out.println("\n7. Does it contain element ''red''?: " + list.contains("red"));

//8. Write a Java program to sort a given array list.
        List sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println("\n8. Sorted list: " + sortedList);

        //   System.out.println("8. Sorted list:\n"+ list.sort(ce bag aici?););
//9. Write a Java program to copy one array list into another.
        List list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println("\n9. List 1:" + list);
        System.out.println("Copied list: " + list2);

//10. Write a Java program to shuffle elements in an array list.
        Collections.shuffle(list2);
        System.out.println("\n10. Initial list is " + list);
        System.out.println("Shuffled list is: " + list2);

//11.Write a Java program to reverse elements in an array list.
// Collections.reverse(list);

//12.extract a portion of an array list
// try list.subList(2,4); catch IndexOutOfBoundsException();

//13.???compare two array lists.

//14.swap two elements in an array list.
// Collections.swap(list2,0,3);

//15.join two array lists.
        var listToJoinTo = new ArrayList<>(Arrays.asList(list));
        listToJoinTo.addAll(Arrays.asList(list));
        //??de ce il primeste, daca addAll ia Collection? Lista nu e o Collection?
        System.out.println("\n15. After adding list to itelf: \n" + listToJoinTo);

/*16.clone an array list to another array
Collections.copy(list2,list);

/*17.empty an array list
list2=Collections.emptyList();

/*18.test an array list is empty or not.
list.isEmpty();

/*???19.trim the capacity of an array list the current list size.
/*???20. increase the size of an array list.
*/
    }
}
