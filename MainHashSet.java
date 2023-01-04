package dataStructure.hashSet;
import java.util.*;

public class MainHashSet {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();
		hs.add(7);hs.add(5);hs.add(2);hs.add(1);
		hs.add(6);hs.add(9);hs.add(0);hs.add(1);
		System.out.println(hs);
		hs.remove(6);
		System.out.println(hs);
		System.out.println(hs.contains(7));
		System.out.println(hs.contains(6));
		System.out.println(hs.size());
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hs);
		for(Integer e: hs) {
			System.out.println(e);
		}
	}

}
