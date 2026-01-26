import java.util.*;

public class SortPeople {
    public static void main(String[] args) {

        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        Integer[] idx = new Integer[names.length];
        for(int i=0;i<idx.length;i++) idx[i]=i;

        Arrays.sort(idx,(a,b)->heights[b]-heights[a]);

        String[] result = new String[names.length];
        for(int i=0;i<idx.length;i++){
            result[i]=names[idx[i]];
        }

        System.out.println(Arrays.toString(result));
    }
}
