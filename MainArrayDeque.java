package dataStructure.arrayDeque;
import java.util.*;

public class MainArrayDeque{

	public static void main(String[] args) {
		Deque<Integer> ad = new ArrayDeque<>();
		ad.offer(2);
		System.out.println(ad);
		ad.offerFirst(5);
		System.out.println(ad);
		ad.offerLast(3);
		System.out.println(ad);
		ad.offer(6);
		System.out.println(ad);
		ad.pollLast();
		System.out.println(ad);
		System.out.println(ad.peekLast());
		System.out.println(ad);
		Iterator<Integer> it = ad.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
