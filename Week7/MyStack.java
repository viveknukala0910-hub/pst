import java.util.*;

class MyStack {

    Queue<Integer> q = new LinkedList<>();

    void push(int x) {

        q.add(x);

        for(int i=0;i<q.size()-1;i++)
            q.add(q.remove());
    }

    int pop() {
        return q.remove();
    }

    int top() {
        return q.peek();
    }

    boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {

        MyStack s = new MyStack();

        s.push(10);
        s.push(20);

        System.out.println(s.top());
        System.out.println(s.pop());
    }
}