package bigram;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bigram {

	public static void main(String[] args) {

		String s = "abbcceeeeeeabcc";
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length() - 1; i++) {
			String bigram = s.substring(i, i+2);

			if (map.containsKey(bigram)) map.put(bigram, map.get(bigram) + 1);
			else map.put(bigram, 1);

		}

		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Integer> entry = (Entry<String, Integer>) iter.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		String test = "ja";
		System.out.print("Za string '" +test);
		for (int i = 0; i < 3; i++) {
			int maxFrekvencija = 0;
			String bigramSaNajvecomFrekvencijom = "";

			for (Map.Entry<String, Integer> e : map.entrySet()) {
				if (e.getKey().startsWith(test.substring(test.length()-1))) {
					if (maxFrekvencija < e.getValue()) {
						bigramSaNajvecomFrekvencijom = e.getKey();
						maxFrekvencija = e.getValue();
					}
				}
			}

			if (maxFrekvencija > 0) {
				char narednoSlovo = bigramSaNajvecomFrekvencijom.charAt(1);
				test = test + "" + narednoSlovo;
			}

		}

		System.out.println("' predvidjeni string je: " +test);
	}
}
