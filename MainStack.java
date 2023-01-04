package dataStructure.stack;
import java.util.Iterator;
import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(9);s.push(3);s.push(5);s.push(7);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s);
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}