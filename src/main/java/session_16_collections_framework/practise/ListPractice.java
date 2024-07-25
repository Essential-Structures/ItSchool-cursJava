package session_16_collections_framework.practise;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        var myList = initializeList();
        var updatedList = updateList(myList, 3, 7);
        System.out.println("Updated list: "+updatedList);

        boolean isElementPresent=isElementPresent(myList,3);
        System.out.println("Is my element present? "+isElementPresent);
    }



    public static boolean isElementPresent(List<Integer> list, int value) {
        return list.contains(value);
    }



    public static List<Integer> updateList(List<Integer> list, int index, int value) throws IndexOutOfBoundsException {
        if (index < 0 || index > list.size()) {
            System.out.println("Invalid index, your list is "+list);
                        throw new IndexOutOfBoundsException();
        }

        var result = new ArrayList<>(list);
        result.set(index, value);
        return result;
    }



    public static List<Integer> initializeList() {
        var list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) list.add(i);
        return list;
    }
}
