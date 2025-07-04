package ads.a4.aufgabe1;

public class HashingExperiment {


    public static int uniformValues() {
      int collisionsum=0;
      RandomString randomString = new RandomString();

        for (int i=0;i<=1000;i++)
        {
            StringTable tabelle = new StringTable(10);
            
            collisionsum+=tabelle.put(randomString.nextUniform());
            collisionsum+=tabelle.put(randomString.nextUniform());

        }
        return collisionsum;
    }

    public static int uniformValues2() {
        int collisionsum=0;
        RandomString randomString = new RandomString();

        for (int i=0;i<=1000;i++)
        {
           StringTable2 tabelle = new StringTable2(10);
            
            collisionsum+=tabelle.put(randomString.nextUniform());
            collisionsum+=tabelle.put(randomString.nextUniform());

        }return collisionsum;
    }

    public static int gaussianValues() {
   int collisionsum=0;
    RandomString randomString = new RandomString();

        for (int i=0;i<=1000;i++)
        {
           StringTable2 tabelle = new StringTable2(10);
            
            collisionsum+=tabelle.put(randomString.nextGaussian());
            collisionsum+=tabelle.put(randomString.nextGaussian());

        }return collisionsum;
    }

    public static void main(String[] args) {
    
        int valsum1 = uniformValues();
        int valsum2 = uniformValues2();
        int valsum3= gaussianValues();
        System.out.println("Ergebnis 1: " + valsum1);
        System.out.println("Ergebnis 2: " + valsum2);
        System.out.println("Ergebnis 3:"+valsum3);
        //d.)4.5. fehlt
    }
    //d.) Es fehlt bei Values2 die gleichmäßige Streueung der einzelnen Schlüssel auf die Felder der Hashtabelle

}
