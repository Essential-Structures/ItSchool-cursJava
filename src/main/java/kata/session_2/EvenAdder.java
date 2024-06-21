package kata.session_2;

import java.util.ArrayList;
import java.util.List;

public class EvenAdder {

    public static void main(String[] args) {
        List<Integer> list = populateList(1000);

        int sumEvenNumbers = sumEvenNumbers(list);

        System.out.println("Sum: " + sumEvenNumbers);
    }

    public static int sumEvenNumbers(List<Integer> integerList) {
        int sum = 0;

        for (int number : integerList) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }

    public static List<Integer> populateList(int integerLimit) {
        List<Integer> list = new ArrayList<>();

        for (int index = 1; index <= integerLimit; index++) {
            list.add(index);
        }

        return list;
    }
}