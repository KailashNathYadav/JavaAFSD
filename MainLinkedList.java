package dataStructure.linkedList;
import java.util.LinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(2);ll.add(3);ll.add(1);ll.add(5);
		ll.add(0,0);
		System.out.println(ll);
		ll.set(3, 6);
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.size());
		ll.remove(3);
		System.out.println(ll);
		ll.add(1,5);
		System.out.println(ll);
		ll.remove(Integer.valueOf(5));
		System.out.println(ll);
		ll.add(1);
		ll.sort(null);
		System.out.println(ll);
		ll.add(3,3);
		System.out.println(ll);
		System.out.println(ll.indexOf(3));
		System.out.println(ll.lastIndexOf(3));
	}

}
