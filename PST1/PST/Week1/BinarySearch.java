public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int key = 7;

        int low = 0, high = arr.length - 1;
        int pos = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println(pos);
    }
}
