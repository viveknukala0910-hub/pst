import java.util.*;

class EntityRecord {
    int enrollmentId;
    String student;
    String course;
    String instructor;
    String startDate;
    int duration;

    EntityRecord(int id, String student, String course, String instructor, String date, int duration) {
        this.enrollmentId = id;
        this.student = student;
        this.course = course;
        this.instructor = instructor;
        this.startDate = date;
        this.duration = duration;
    }

    void display() {
        System.out.println("Enrollment_ID: " + enrollmentId +
                ", Student: " + student +
                ", Course: " + course +
                ", Instructor: " + instructor +
                ", Start Date: " + startDate +
                ", Duration: " + duration + " weeks");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<EntityRecord> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String student = sc.next();
            String course = sc.next();
            String instructor = sc.next();
            String date = sc.next();
            int duration = sc.nextInt();

            list.add(new EntityRecord(id, student, course, instructor, date, duration));
        }

        for (EntityRecord e : list) {
            e.display();
        }
    }
}