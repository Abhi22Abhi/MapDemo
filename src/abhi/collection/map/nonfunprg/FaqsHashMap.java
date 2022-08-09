package abhi.collection.map.nonfunprg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FaqsHashMap {

	public static void main(String[] args) {
		
		Map<String, String> hashMap1 = new HashMap<>();
		hashMap1.put("Test1", "A");
		hashMap1.put("Test2", "B");
		hashMap1.put("Test3", "C");
		hashMap1.put("Test1", "D");
		System.out.println("HashMap1 : " + hashMap1); 
		
		//Internal Work Process of put()
		for(Entry<String, String> obj :hashMap1.entrySet()) {
			System.out.println(obj.getKey().hashCode()+":"+obj.getKey()+"<->"+obj.getValue());
		}
		
		Map<String, String> hashMap2 = new HashMap<>();
		hashMap2.put("Test1", "A");
		hashMap2.put("Test2", "B");
		hashMap2.put("Test3", "C");
		hashMap2.put("Test1", "D");
		System.out.println("HashMap2 : " + hashMap2); 
		
		//Internal Work Process of put()
		for(Entry<String, String> obj :hashMap2.entrySet()) {
			System.out.println(obj.getKey().hashCode()+":"+obj.getKey()+"<->"+obj.getValue()); 
		}
		
		/*In hashMap2, when we try to create object to for keys which are types of String then SCP objects will be used
		  which are already created for hashMap1.
		*/
		
		Map<Integer, String> hashMap11 = new HashMap<>();
		hashMap11.put(1, "A");
		hashMap11.put(2, "B");
		hashMap11.put(3, "c");
		hashMap11.put(1, "D");
		System.out.println("HashMap11 : " + hashMap11); 
		
		//Internal Work Process of put()
		for(Entry<Integer, String> obj :hashMap11.entrySet()) {
			System.out.println(obj.getKey().hashCode()+":"+obj.getKey()+"<->"+obj.getValue());
		}
		
		Map<Integer, String> hashMap22 = new HashMap<>();
		hashMap22.put(1, "A");
		hashMap22.put(2, "B");
		hashMap22.put(3, "c");
		hashMap22.put(1, "D");
		System.out.println("HashMap22 : " + hashMap22); 
		
		//Internal Work Process of put()
		for(Entry<Integer, String> obj :hashMap22.entrySet()) {
			System.out.println(obj.getKey().hashCode()+":"+obj.getKey()+"<->"+obj.getValue()); 
		}
	}

}
