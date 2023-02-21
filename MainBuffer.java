package stringbuffer;

public class MainBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//String is immutable whereas StringBuffer and StringBuilder are mutable classes. 
		//suppose you have array of string you want to concatenate them quickly..........
		
		String[] friends = new String[] {"Michal","James","John","Robert","Aliyana"};
		for(String friend: friends) {
			sb.append(friend);
			sb.append(" ");
		}
		
		System.out.println("Result after appending every friend		" + sb + "class" +  sb.getClass());
		System.out.println("Reversing the appended friend list.");
		System.out.println(sb.reverse());
		System.out.println("sb is mutable now reverse it once again.");
		sb.reverse();
		System.out.println(sb.toString());
		System.out.println("Converted string buffer to string class		" + sb.getClass());
	}
}
