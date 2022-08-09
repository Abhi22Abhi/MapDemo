package abhi.collection.map.nonfunprg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ReadyMadeMethodsOfMap_03 {

	public static void main(String[] args) {
		
		Map<String, String> hashMap = new HashMap<>();
		
						//**************************************Adding*******************************************
		
		hashMap.put("Test1", "A");
		hashMap.put("Test2", "B");
		hashMap.put("Test4", "A");
		hashMap.put("Test3", "C");
		System.out.println("hashMap.put(k, v) : " + hashMap);
		System.out.println();
		
		
	
//		Map<String, String> hashMap1 = new HashMap<>(hashMap);
//		System.out.println("HashMap<>(hashMap); : " + hashMap1);
		
		Map<String, String> hashMap1 = new HashMap<>();
		hashMap1.putAll(hashMap);
		System.out.println("hashMap1.putAll(hashMap) : " + hashMap1);
		System.out.println();
		
		String putIfAbsent1 = hashMap.putIfAbsent("Test1", "AA");
		System.out.println("hashMap.putIfAbsent(\"Test1\", \"AA\"); : " + putIfAbsent1);
		System.out.println(hashMap);
		String putIfAbsent2 = hashMap.putIfAbsent("Test11", "AAA");
		System.out.println("hashMap.putIfAbsent(\"Test11\", \"AAA\"); :" + putIfAbsent2);
		System.out.println(hashMap);
		System.out.println();
		
		
		
						//**************************************remove*******************************************
		
//		System.out.println("hashMap.remove(\"Test1\") : " + hashMap.remove("Test1"));
//		System.out.println(hashMap);
//		System.out.println();
		
		System.out.println("hashMap.remove(\"Test1\",\"A\") : " + hashMap.remove("Test1","A"));
		System.out.println(hashMap);
		System.out.println();
		
		
						//**************************************replace*******************************************
		
		System.out.println("hashMap.replace(\"Test3\", \"x\") : " + hashMap.replace("Test3", "x"));
		System.out.println(hashMap);
		System.out.println();
		
		System.out.println("hashMap.replace(\"Test3\", \"x\", \"y\") : " + hashMap.replace("Test3", "x", "y"));
		System.out.println(hashMap);
		System.out.println("hashMap.replace(\"Test2\", \"z\", \"y\") : " + hashMap.replace("Test2", "z", "y"));
		System.out.println(hashMap);
		System.out.println();
		
		
					//**************************************retrieve*******************************************
		System.out.println("By Map Obj : "+hashMap);
		System.out.println();
		
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		System.out.println("By Entry Obj : "+entrySet);
		System.out.println();
		
//		System.out.println(" => Printing only Key set : "+ entrySet.keySet());
		Set<String> keySet = hashMap.keySet();
		System.out.println(" => Printing only Key set  => hashMap.keySet() : "+ keySet);
		Collection<String> values = hashMap.values();
		System.out.println(" => Printing only Values Collection  => hashMap.values() : "+ values);
		String valueOfTest4Key = hashMap.get("Test4");
		System.out.println(" => Printing a particular Key Value => hashMap.get(\"Test4\") : "+ valueOfTest4Key);
		String orDefault1 = hashMap.getOrDefault("Test4", "abhi");
		System.out.println(" => hashMap.getOrDefault(\"Test4\", \"abhi\"); : "+ orDefault1);
		String orDefault2 = hashMap.getOrDefault("Test444", "abhi");
		System.out.println(" => hashMap.getOrDefault(\"Test444\", \"abhi\"); : "+ orDefault2);
		System.out.println();
		
		
		
		System.out.println(" => Printing by using forEach : ");
		for(Entry<String, String> entrySet1 :entrySet) {
			System.out.println(entrySet1);
		}
		System.out.println();
		
		
		
		System.out.println(" => Printing by using itterator() : ");
//		hashMap.it
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			System.out.println(next);
			
		}
		System.out.println();
		
		System.out.println(" => Printing by using Java8 forEach() intermediate Operation : ");
//		hashMap.forEach(i-> System.out.println(i));
		hashMap.entrySet().forEach(i-> System.out.println(i));
		System.out.println();
		
	
		//**************************************Few Checking on Map*******************************************
		
		System.out.println(" ==> hashMap.isEmpty() : "+ hashMap.isEmpty());
		System.out.println(" ==> hashMap.size() : "+ hashMap.size());
		System.out.println(" ==> hashMap.containsKey(\"Test3\") : "+ hashMap.containsKey("Test3"));
		System.out.println(" ==> hashMap.containsValue(\"AAA\") : "+ hashMap.containsValue("AAA"));
		System.out.println("hashMap.clear();");
		hashMap.clear();
		System.out.println("hashMap : "+ hashMap);
		System.out.println();
	
		//**************************************null on Map*******************************************
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("A", 1);
		map1.put(null, 2);
		map1.put(null, 3);
		map1.put("D", null);
		map1.put(null, null);
		System.out.println("=> In Map(Not in a TreeMap) 'null' as a \n "
				+ " 1. 'key' always stores as a first element, duplicate null as keys values OverRide \n "
				+ " 2. 'value' treats like other values.");
		System.out.println(map1);
		
		Map<String, Integer> map2 = new TreeMap<String, Integer>();
		map2.put("A", 1);
//		map2.put(null, 2); // java.lang.NullPointerException
		
		System.out.println(map2);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
