package ads.a3.aufgabe2;

import ads.a3.SortingAlgorithm;

public class BubbleSort extends SortingAlgorithm {

    public int array[];
    public int end;
    public long prevswap = 0;
    public long starttime;

    public BubbleSort(int f[]) {
        this.array = f;
        end = array.length;
    }

// Gemessen werden soll Anzahl der Vergleiche und Vertauschungen und die Ausführungszeit
    @Override
    public void sort(int f[]) {
      reset();
      
      starttime=System.currentTimeMillis();

        for (int i = 0; i < end; i++) {
            for (int j = end - 1; j >= i; j--) {
                comparison++;
                if (f[j] > f[j + 1]) {
                    swap(f, j, j + 1);
                    swap++;
                }

            }
            if (swap == prevswap) {
                break;
            } else {
                prevswap = swap;
            }
            count++;
        }
    duration=(System.currentTimeMillis()-starttime);
    }

}
