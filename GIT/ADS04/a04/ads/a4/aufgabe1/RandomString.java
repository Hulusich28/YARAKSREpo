package ads.a4.aufgabe1;

import java.util.Random;

public class RandomString {

    Random rng;
    int last = -1;

    public RandomString() {
        rng = new Random(0);
    }

    public String nextUniform() {
        int current = rng.nextInt(20);

        while(last == current) {
            current = rng.nextInt(20);
        }

        last = current;

        return String.valueOf((char) current);
    }

    public String nextGaussian() {
        int current = (int) rng.nextGaussian(10, 1);

        while(last == current) {
            current = (int) rng.nextGaussian(10, 1);
        }

        last = current;

        return String.valueOf((char) current);
    }

}
