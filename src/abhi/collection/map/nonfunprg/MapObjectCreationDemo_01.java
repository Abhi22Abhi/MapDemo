package abhi.collection.map.nonfunprg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapObjectCreationDemo_01 {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap1 = new HashMap<>();
		
		Map<String, Integer> hashMap2 = new HashMap<>(24);
		//System.out.println("Capacity of map : "+hashMap2.capa);
		
		Map<String, Integer> hashMap3 = new HashMap<>(56, 0.81f);
		Map<String, Integer> hashMap4 = new HashMap<>(hashMap1);
		

		
		Map<String, Integer> linkedHashMap1 = new LinkedHashMap<>();
		Map<String, Integer> linkedHashMap2 = new LinkedHashMap<>(10);
		Map<String, Integer> linkedHashMap3 = new LinkedHashMap<>(72, 054f);
		Map<String, Integer> linkedHashMap4 = new LinkedHashMap<>(linkedHashMap1);
		
		
		
		Map<String, Integer> treeMap1 = new TreeMap<>();
//		Map<String, Integer> treeMap2 = new TreeMap<>(26);
//		Map<String, Integer> treeMap3 = new TreeMap<>(72, 054f);
//		Map<String, Integer> treeMap2 = new TreeMap<>(Comparator);
//		Map<String, Integer> treeMap3 = new TreeMap<>(SortedMap);
		Map<String, Integer> treeMap4 = new TreeMap<>(treeMap1);
	}

}
