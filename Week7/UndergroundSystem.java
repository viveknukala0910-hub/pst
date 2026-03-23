import java.util.*;

class UndergroundSystem {

    class CheckIn {
        String station;
        int time;

        CheckIn(String s,int t) {
            station = s;
            time = t;
        }
    }

    HashMap<Integer,CheckIn> map = new HashMap<>();
    HashMap<String,int[]> travel = new HashMap<>();

    void checkIn(int id,String station,int t) {
        map.put(id,new CheckIn(station,t));
    }

    void checkOut(int id,String station,int t) {

        CheckIn c = map.get(id);
        map.remove(id);

        String key = c.station + "-" + station;

        travel.putIfAbsent(key,new int[2]);

        travel.get(key)[0] += (t - c.time);
        travel.get(key)[1] += 1;
    }

    double getAverageTime(String start,String end) {

        String key = start + "-" + end;

        int[] val = travel.get(key);

        return (double)val[0]/val[1];
    }

    public static void main(String[] args) {

        UndergroundSystem obj = new UndergroundSystem();

        obj.checkIn(1,"A",3);
        obj.checkOut(1,"B",8);

        System.out.println(obj.getAverageTime("A","B"));
    }
}