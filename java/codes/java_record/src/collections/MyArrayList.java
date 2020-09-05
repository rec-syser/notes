package collections;

import java.util.Arrays;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] elements;

    public MyArrayList(){
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(T element){
//        elements[size++] = element;
        add(size, element);
    }

    public void add(int index, T element){
        if(index<0 || index>size){
            return;
        }
        ensureCapacity();
        for(int i=size;i>index;i--){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;
    }

//  扩容
    private void ensureCapacity(){
        if(size < elements.length){
            return;
        }
        int newCapacity = elements.length + ( elements.length >> 1 ); // 又移一位 相当于除以2
        Object[] newElements = new Object[newCapacity];
        for(int i=0;i<size;i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

//  引用数据类型的删除元素的最后一个需要设置为 null 不然垃圾回收机制不能回收
    @SuppressWarnings("unchecked")
    public T remove(int index){
        if(index<0 || index>=size){
            return null;
        }
        T old = (T) elements[index];
        for(int i=index; i<size-1;i++ ){
            elements[i] = elements[i+1];
        }
        elements[--size] = null;
        return old;
    }
    //  引用数据类型的删除元素需要设置为 null 不然垃圾回收机制不能回收
    public void clear(){
        for(int i=0;i<size;i++){
            elements[i] = null;
        }
        size = 0;

    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
