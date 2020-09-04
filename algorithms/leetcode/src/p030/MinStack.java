package p030;

import java.util.ArrayDeque;

class MinStack {
    private ArrayDeque<Integer> stack;
    private ArrayDeque<Integer> minMember;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.minMember = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minMember.isEmpty()){
            minMember.push(x);
        }
        else if(x <= minMember.getFirst()){
            minMember.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if(!minMember.isEmpty() && x == minMember.getFirst()){
            minMember.pop();
        }
    }

    public int top() {
        return stack.getFirst();
    }

    public int min() {
        return minMember.getFirst();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        ms.push(2);
        ms.min();
    }
}

