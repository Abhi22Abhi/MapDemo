package abhi.collection.map.funprg;

import java.util.Arrays;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {

//		Map<String, String> hashMap = new HashMap<>();
//
//		hashMap.put("Test1", "A");
//		hashMap.put("Test2", "B");
//		hashMap.put("Test4", "A");
//		hashMap.put("Test3", "C");
//		System.out.println("hashMap.put(k, v) : " + hashMap);
//		System.out.println();
//		
////		hashMap.fo
//		hashMap.entrySet().forEach(i-> System.out.println(i));
//		System.out.println();

//		  
//        List<Integer> list = Arrays.asList(20, 10, 40);
//        Integer sum_a = list.stream().reduce(0, (a, b) -> a+b);
//		System.out.println(sum_a);
//		
//		int sum = list.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum);
//		

//		int[] arr = { 20, 10, 40, 567 };
//
//		int max = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println();

		int[] a = new int[] { 0, 22, 0, 3, 55, 0, 0, 4, 11, 100 };
		int arrayIndexSize = a.length;
		int arrayIndexCount = 0;

		for (int i = 0; i < arrayIndexSize; i++) {
			if (a[i] != 0) {
				a[arrayIndexCount] =  a[i];
				arrayIndexCount = arrayIndexCount+1;
			}
		}

		while(arrayIndexCount < arrayIndexSize) {
			a[arrayIndexCount] = 0;
			arrayIndexCount = arrayIndexCount+1;
		}
		
		for(int a1: a) {
			System.out.print(a1+" ");
		}

	}
}
