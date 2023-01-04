package dataStructure.maxHeap;
import java.util.*;

public class MainMaxHeap {

	public static void main(String[] args) {
		//we want maxHeap use Comparator.reverseOrder()
		Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		maxHeap.offer(2);
		maxHeap.offer(6);
		maxHeap.offer(3);
		System.out.println(maxHeap);
		System.out.println(maxHeap.peek());
		maxHeap.poll();
		System.out.println(maxHeap);
		System.out.println(maxHeap.size());
		System.out.println(maxHeap);
		Iterator<Integer> it = maxHeap.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(maxHeap);
		for(Integer ele: maxHeap) {
			System.out.println(ele);
		}
		System.out.println(maxHeap);
		while(!maxHeap.isEmpty()) {
			System.out.println(maxHeap.poll());
		}
	}

}
