package dataStructure.hashmap;
import java.util.*;

public class MainHashMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("three", 3);
		map.put("five", 5);
		map.putIfAbsent("one", 98);
		System.out.println(map);
		System.out.println(map.get("five"));
		System.out.println(map.getOrDefault("six",-1));
		System.out.println(map.containsKey("one"));
		System.out.println(map.containsValue(5));
		map.remove("five");
		System.out.println(map);
		for(Map.Entry<String,Integer> e: map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		System.out.println(map);
		for(String s: map.keySet())
			System.out.println(s);
		for(Integer i: map.values())
			System.out.println(i);
		map.clear();
		System.out.println(map);
	}

}
