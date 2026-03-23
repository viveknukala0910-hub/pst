import java.util.*;

class BrowserHistory {

    ArrayList<String> list = new ArrayList<>();
    int current;

    BrowserHistory(String homepage) {
        list.add(homepage);
        current = 0;
    }

    void visit(String url) {

        while(list.size() > current + 1)
            list.remove(list.size()-1);

        list.add(url);
        current++;
    }

    String back(int steps) {

        current = Math.max(0,current-steps);
        return list.get(current);
    }

    String forward(int steps) {

        current = Math.min(list.size()-1,current+steps);
        return list.get(current);
    }

    public static void main(String[] args) {

        BrowserHistory bh = new BrowserHistory("google.com");

        bh.visit("facebook.com");
        bh.visit("youtube.com");

        System.out.println(bh.back(1));
        System.out.println(bh.forward(1));
    }
}