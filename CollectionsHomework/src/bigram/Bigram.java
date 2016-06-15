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
	}
}
