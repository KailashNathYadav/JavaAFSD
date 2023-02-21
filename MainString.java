package string;

public class MainString {
	public static void main(String[] args) {
		String s = " I am string ";
		String t = " I am another string";
		//length(), substring(), + , charAt() , toUC, toLC, trim, empty, indexOf, split, startsWith()
		System.out.println(s.length());
		System.out.println(s.substring(3));
		System.out.println(s.substring(1,3));//startIndex , endIndex
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(3));
		System.out.println(s + t);
		System.out.println(s.trim());
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		System.out.println(s.indexOf('s'));
		System.out.println(t.lastIndexOf('a'));
		System.out.println(s.equals(t));
		System.out.println(s.compareTo(t));
		System.out.println(s.toCharArray());
		System.out.println(s.replace("I am", "I`m"));
		System.out.println(t.startsWith(" I"));
		System.out.println(t.endsWith("tring"));
		System.out.println(t.contains("another"));
	}
}
