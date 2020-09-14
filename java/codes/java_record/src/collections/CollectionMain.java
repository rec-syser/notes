package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionMain {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        HashMap<String, String> map = new HashMap<>();
        Hashtable<String, String> tabel = new Hashtable<>();
        ConcurrentHashMap<String, String> cmap = new ConcurrentHashMap<>();
        System.out.println( 1 >>> 4);
    }

    public static void testMyArrayList(){
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
