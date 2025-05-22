
import java.util.List;
import java.util.Random;

public class ListExperiment {                       //ist die Deklaration von "liste" richtig  , Aufg. eigentlich list=EmptyList()

    List<Integer> liste;
    final Random NUMGEN = new Random(1234);
    public int b;
   
    Result result = new Result(new Stopwatch(), new Stopwatch(), new Stopwatch());

    ListExperiment(int n, List<Integer> emptyList) 
    {        //??
        this.liste = emptyList;
        this.b = n;
    }

    public void run() 
    {
        int index;
       long diff;
        
        for (int i = 0; i <= b; i++) {
            result.getSearchTime().reset();                                               // Einfügen von Elementen
            int value = NUMGEN.nextInt();                                           //?? seeds anschauen
            index = 0;
            diff=result.getSearchTime().elapsedTime();                                     // Korrekte Messposition von Searchposition?
            result.getSearchTime().tracktime(diff);
            while ((index <= liste.size() - 1) && (liste.get(index) < value)) {
                result.getInsertTime().reset();
                index = index + 1;
                liste.add(index, value);
                diff=result.getInsertTime().elapsedTime();
                result.getInsertTime().tracktime(diff);
            }

        }

        for (int i = 0; i <= b; i++) // Löschen von Elementen 
        {
            result.getRemoveTime().reset();                         //Entfernzeit-Messung eingebaut!
            index = NUMGEN.nextInt(0, liste.size() - 1);
            liste.remove(index);
            diff= result.getRemoveTime().elapsedTime();
            result.getRemoveTime().tracktime(diff);
        }
    }

    public Result getResult() {
        return result;
    }
}
