import java.time.LocalDate;
import java.util.*;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek());
    }
}
