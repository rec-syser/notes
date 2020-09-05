package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class CollectionMain {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        MyArrayList<String> myArrayList = new MyArrayList();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");
        myArrayList.add(2, "abc");
        System.out.println(myArrayList.toString());
        myArrayList.remove(2);
        System.out.println(myArrayList.toString());
        myArrayList.clear();
        System.out.println(myArrayList.toString());
        System.gc();
    }
}
