package dataStructure.linkedHashSet;
import java.util.*;

public class MainLinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(5);lhs.add(7);lhs.add(1);lhs.add(6);
		System.out.println(lhs);
		lhs.remove(7);
		System.out.println(lhs);
		System.out.println(lhs.contains(6));
		Iterator<Integer> it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
