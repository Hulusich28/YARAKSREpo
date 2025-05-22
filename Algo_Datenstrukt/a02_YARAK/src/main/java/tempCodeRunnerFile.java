public class Stopwatch {
public long timeref;
    public Stopwatch() {
        ArrayList<Time> zeit = new ArrayList<Time>();
        long timeref = System.currentTimeMillis();
    }

    public long elapsedTime() {
        long timecurr=System.currentTimeMillis();
        long diff=0;

        diff = timecurr - timeref;

        return diff;
    }
}