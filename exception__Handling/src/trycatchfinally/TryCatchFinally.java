package trycatchfinally;

public class TryCatchFinally {
	public static void main(String[] args) {
		String h = "Hello";
		//Why finally is used .............
		try {
			System.out.println(h.charAt(5));
			System.out.println("I am not going to be executed.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Code that need to be executed.");
		}
	}
}
