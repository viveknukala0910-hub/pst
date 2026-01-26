import java.util.*;
import java.util.stream.*;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("A", "B", "A", "C");

        List<String> list = names.stream().collect(Collectors.toList());
        System.out.println("toList: " + list);

        Set<String> set = names.stream().collect(Collectors.toSet());
        System.out.println("toSet: " + set);

        long count = names.stream().collect(Collectors.counting());
        System.out.println("counting: " + count);

        String joined = names.stream().collect(Collectors.joining(","));
        System.out.println("joining: " + joined);

        Map<String, Long> group = names.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("groupingBy: " + group);
    }
}
