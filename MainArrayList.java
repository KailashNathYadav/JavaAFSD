package dataStructure.arrayList;
import java.util.*;

public class MainArrayList {

	public static void main(String[] args) {
		// add set get remove contains indexOf lastIndexOf length iteration in 3-ways 
		// Collections.sort() .reverseOrder() 
		List<Integer>  al = new ArrayList<>();
		al.add(1);al.add(4);al.add(5);al.add(2);al.add(3);
		System.out.println(al);
		Collections.addAll(al,1,3,5,52,56);
		System.out.println(al);
		al.set(2, 4);
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.size());
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.remove(Integer.valueOf(5));
		System.out.println(al);
		al.add(2,4);
		System.out.println(al);
		System.out.println(al.indexOf(4));
		System.out.println(al.lastIndexOf(4));
		System.out.println(al);
		System.out.println(al.contains(3));
		System.out.println(al.lastIndexOf(3));
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(al);
		Collections.sort(al);
		for(Integer ele: al) {
			System.out.println(ele);
		}
		Collections.sort(al,Collections.reverseOrder());
		for(int i = 0; i < al.size(); i ++)
			System.out.println(al.get(i));
		List<Integer> temp = new ArrayList<>(al);
		System.out.println(temp);
		System.out.println(Collections.disjoint(al, temp));
//		al.clear();
	}

}
