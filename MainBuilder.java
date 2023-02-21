package stringbuider;

public class MainBuilder {
	public static void main(String[] args) {
		//Mutable and not synchronized and hence performance wise it is better than string-buffer.
		StringBuilder sbns = new StringBuilder();
		String[]  books = new String[] {"Atomic Habit","Rich dad Poor dad","Can`t Hurt Me"};
		for(String book : books) {
			sbns.append(book);
			sbns.append(" ");
		}
		System.out.println(sbns.reverse());
		sbns.reverse();
		System.out.println(sbns.toString());
	}
}
