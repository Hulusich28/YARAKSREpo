
import java.util.ArrayList;

public class Stopwatch {

    public long timeref;
    public ArrayList<Long> zeit = new ArrayList<>();

    Stopwatch() {
        this.timeref = System.currentTimeMillis();
    }

    public void tracktime(long diff) {
        zeit.add(diff);

    }

    public void reset() {
       timeref = System.currentTimeMillis();
    }

    public long averageTime() {
        long averg = 0;

        if (zeit.isEmpty()) {
            throw new RuntimeException("Don Corleone"); //Muss noch überarbeitet werden 
        } else {
            for (int i = 0; i < zeit.size(); i++) {
                averg = averg + zeit.get(i);
            }
            averg = averg / zeit.size();
        }

        return averg;
    }

    public long totalTime() {
        long totalT = 0;

        for (int e = 0; e < zeit.size(); e++) {
            totalT = totalT + zeit.get(e);
        }
        return totalT;
    }

    public long elapsedTime() {
        long timecurr = System.currentTimeMillis();
        long diff;

        diff = timecurr - timeref;
        tracktime(diff);
        return diff;
    }

}
