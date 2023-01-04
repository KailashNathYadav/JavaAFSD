package dataStructure.queue;
import java.util.*;

public class MainQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(8);
		queue.offer(7);
		queue.offer(2);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println(queue);
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
