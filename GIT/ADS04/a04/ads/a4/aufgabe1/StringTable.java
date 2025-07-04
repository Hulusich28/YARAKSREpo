package ads.a4.aufgabe1;

/**
 * An implementation of a hash table for strings.
 */
public class StringTable {

    int m;
    int currentsize = 0;
    String[] Stringtable;

    public StringTable(int capacity) {
        this.m = capacity;
        this.Stringtable = new String[m];
    }

    /**
     * Compute the hash value for a string
     */
    public int hash(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum = sum + s.charAt(i);
        }
       
        return sum % m;
    }

    /**
     * Add a string to the table
     *
     * @return the number of collisions encountered
     */
    public int put(String s) {
        int collision = 0;
		int position = hash(s);

        if (currentsize >= m) {
            throw new RuntimeException("Hashtabelle ist Voll!");
        }

         while (Stringtable[position] != null) {
            if (Stringtable[position].equals(s)) {
                return collision; 
			            }
            collision++;
            position = (position + 1) % m;
        }

        Stringtable[position] = s;
        currentsize++;
        return collision;
    }

    
    /**
     * Delete a string from the table
     *
     * @return the number of collisions encountered
     */
    public int delete(String s) {

        int collision = 0;
		int position = hash(s);

        if (Stringtable[position].equals(s)) {
            Stringtable[position] = null;
        } else {
            for (int i = position; i < (m + position); i++) {
                if (!(Stringtable[i % m].equals(s))) {
                    collision++;
                } else {
                    Stringtable[i % m] = null;
                }

            }
        }

        currentsize--;
        return collision;
    }

    /**
     * Check whether the table contains a string
     */
    public boolean contains(String s) {
        for (int i = hash(s); i < (m + hash(s)); i++) {
            if (Stringtable[i % m].equals(s)) {
                return true;
            }
        }
        return false;
    }
}
