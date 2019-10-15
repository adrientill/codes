package example1;

import java.util.HashMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<>();
		hm.put(123, " java "); /// put
		hm.put(145, " jee ");
		hm.put(113, " adjg ");
		hm.put(null, " java ");
		hm.put(178, null);
		hm.put(199, null); // accepts null values
		System.out.println(hm);
		hm.put(199, " updated ");
		System.out.println(hm);

		Map<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(123, " java "); /// put
		lhm.put(145, " jee ");
		lhm.put(113, " adjg ");
		lhm.put(null, " java ");
		lhm.put(178, null);
		lhm.put(199, null); // accepts null values
		System.out.println(lhm);
		lhm.put(199, " updated "); /// does the same as the hash but maintains order
		System.out.println(lhm);

		Map<Integer, String> tm = new TreeMap<>();
		tm.put(123, " java "); /// put
		tm.put(145, " jee ");
		tm.put(113, " adjg ");
		// tm.put(null, "java"); // key can not be null
		tm.put(178, null);
		tm.put(199, null); // accepts null values
		// System.out.println(tm);
		tm.put(199, "updated");
		System.out.println(tm);

		Map<Integer, String> ht = new Hashtable<>();
		ht.put(123, " java "); /// put
		ht.put(145, " jee ");
		ht.put(113, " adjg ");
		// ht.put(null, "java");
		// ht.put(178, null);
		// ht.put(199, null); // accepts null values
		// System.out.println(ht);
		ht.put(199, " updated ");
		System.out.println(ht);

		System.out.println(ht.size());
		System.out.println(ht.containsKey(111));
		System.out.println(ht.containsValue(" jee "));
		System.out.println(ht.get(111));
		System.out.println(ht.get(145));
		
		ht.remove(123);
		System.out.println(ht);
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		Set<Integer> set=ht.keySet();
		for (Integer i:set) {
			System.out.println(" Key = "+i+" Value = "+ht.get(i));
			
		}
		
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println(" Key /> "+e.getKey()+ " Value -> " +e.getValue());
			
		}
		
		Iterator<Entry<Integer, String>> i=ht.entrySet().iterator();
		
		System.out.println(" Using Iterator ");
		while (i.hasNext()) {
			Entry<Integer, String> e = i.next();
			System.out.println(" Key is "+ e.getKey()+" Value is "+e.getValue());
		}

	}

}
