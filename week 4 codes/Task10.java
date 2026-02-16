import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = m - layer - 1;
            int right = n - layer - 1;

            for (int j = left; j <= right; j++)
                elements.add(matrix.get(top).get(j));

            for (int i = top + 1; i < bottom; i++)
                elements.add(matrix.get(i).get(right));

            for (int j = right; j >= left; j--)
                elements.add(matrix.get(bottom).get(j));

            for (int i = bottom - 1; i > top; i--)
                elements.add(matrix.get(i).get(left));

            int len = elements.size();
            int rot = r % len;

            List<Integer> rotated = new ArrayList<>();
            rotated.addAll(elements.subList(rot, len));
            rotated.addAll(elements.subList(0, rot));

            int idx = 0;

            for (int j = left; j <= right; j++)
                matrix.get(top).set(j, rotated.get(idx++));

            for (int i = top + 1; i < bottom; i++)
                matrix.get(i).set(right, rotated.get(idx++));

            for (int j = right; j >= left; j--)
                matrix.get(bottom).set(j, rotated.get(idx++));

            for (int i = bottom - 1; i > top; i--)
                matrix.get(i).set(left, rotated.get(idx++));
        }

        for (List<Integer> row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);
        int n = Integer.parseInt(firstMultipleInput[1]);
        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            matrix.add(
                Arrays.stream(bufferedReader.readLine().trim().split(" "))
                      .map(Integer::parseInt)
                      .collect(Collectors.toList())
            );
        }

        Result.matrixRotation(matrix, r);
        bufferedReader.close();
    }
}
