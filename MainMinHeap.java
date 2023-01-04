package dataStructure.minHeap;
import java.util.*;

public class MainMinHeap {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.offer(3);
		pq.offer(5);
		pq.offer(1);
		pq.offer(2);
		pq.offer(8);
		System.out.println("priorityQueue: " + pq);
		pq.poll();
		System.out.println("priorityQueue: " + pq);
		System.out.println("peek: "+ pq.peek());
		System.out.println("size: " + pq.size());
		System.out.println(pq);
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
