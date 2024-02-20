import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		
		// Using hashMap 
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"a");
		hm.put(2,"z");
		hm.put(5,"l");
		hm.put(4,"b");
		hm.put(3,"c");
		System.out.println(hm);
		
		//Using TreeMap : represent the data in ascending order
		Map<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1,"a");
		tm.put(2,"z");
		tm.put(5,"l");
		tm.put(4,"b");
		tm.put(3,"c");
		System.out.println(tm);
		
		//Using LinkedHashMap : represent the data in same order
		Map<Integer, String> lm = new LinkedHashMap<Integer, String>();
		lm.put(1,"a");
		lm.put(2,"z");
		lm.put(5,"l");
		lm.put(4,"b");
		lm.put(3,"c");
		System.out.println(lm);
		
		
//		for(Map.entry(Integer, String) m1 :m.entrySey()) {
//			System.out.println(m1.getKey()+" "+m1.getValues());
//		}
		
	}

}
