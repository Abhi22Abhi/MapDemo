package abhi.collection.map.nonfunprg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySetDemo_02 {

	public static void main(String[] args) {
		
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("Test1", "A");
		hashMap.put("Test2", "B");
		hashMap.put("Test3", "C");
		hashMap.put("Test5", "E");
		hashMap.put("Test4", "D");
		System.out.println("HashMap : " + hashMap); // Insertion Order-> Cann't predict->based on hashing
		
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Test1", "A");
		linkedHashMap.put("Test2", "B");
		linkedHashMap.put("Test3", "C");
		linkedHashMap.put("Test5", "E");
		linkedHashMap.put("Test4", "D");
		System.out.println("LinkedHashMap : "+linkedHashMap);// Insertion Order -> Preserved
		
		
		
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("Test1", "A");
		treeMap.put("Test2", "B");
		treeMap.put("Test3", "C");
		treeMap.put("Test5", "E");
		treeMap.put("Test4", "D");
		System.out.println("TreeMap : "+treeMap);// Insertion Order -> Ascending Order
		
//		Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		System.out.println("Map.Entry<String, String> or Entry<String, String>'s Obj : "+entrySet);
		
		
		
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
	}

}
