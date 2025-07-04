package ads.a4.aufgabe1;

/**
 * An implementation of a hash table for strings.
 */
public class StringTable2 extends StringTable {

	public StringTable2(int capacity) {
        super(capacity);
    }

	@Override public int hash(String s) {
		int ascii;
		char letter;
		int sum=0;

		for(int i=0; i<s.length();i++)
		{
			letter = s.charAt(i);
			ascii=letter;
			sum= sum + ascii;
		}

		return (Math.min(sum,m-1))%m;
	}



}
