public class ElementAtIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int index = 2;

        if (index < 0 || index >= arr.length)
            System.out.println(-1);
        else
            System.out.println(arr[index]);
    }
}
