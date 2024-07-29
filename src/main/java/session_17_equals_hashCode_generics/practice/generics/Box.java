package session_17_equals_hashCode_generics.practice.generics;

public class Box<T> {

    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Box<?> stringBox = new Box<>("Textul din cutie");
        System.out.println(stringBox.getObj());

        Integer[] intArray = {2, 6, 9};
        String[] stringArray = {"nume1", "nume7", "nume5"};

        printArray(intArray);
        printArray(stringArray);
    }

    public static <E> void printArray(E[] array) {
        for (E element : array)
            System.out.println(element + " ");
    }
}
