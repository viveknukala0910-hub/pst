import java.util.*;

class StackUsingQueue {

    Queue<Integer> q = new LinkedList<>();

    void push(int x) {

        q.add(x);

        for(int i=0;i<q.size()-1;i++)
            q.add(q.remove());
    }

    int pop() {
        return q.remove();
    }

    int peek() {
        return q.peek();
    }

    boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {

        StackUsingQueue s = new StackUsingQueue();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}