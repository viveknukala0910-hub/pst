import java.time.LocalDate;
import java.util.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, String date) {
        this.name = name;
        this.date = LocalDate.parse(date);
    }
}

public class EventProcessorSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Event[] events = new Event[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String date = sc.next();
            events[i] = new Event(name, date);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (events[i].date.isAfter(events[j].date)) {
                    Event temp = events[i];
                    events[i] = events[j];
                    events[j] = temp;
                }
            }
        }

        for (Event e : events) {
            System.out.print(e.name + " ");
        }
    }
}
