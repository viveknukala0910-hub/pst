class MyHashSet {

    boolean arr[];

    MyHashSet() {
        arr = new boolean[1000000];
    }

    void add(int key) {
        arr[key] = true;
    }

    void remove(int key) {
        arr[key] = false;
    }

    boolean contains(int key) {
        return arr[key];
    }

    public static void main(String[] args) {

        MyHashSet set = new MyHashSet();

        set.add(5);
        set.add(10);

        System.out.println(set.contains(5));

        set.remove(5);

        System.out.println(set.contains(5));
    }
}