package trycatchfinally;

public class NestedTryCatch {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			try {
				System.out.println("yetAnotherException".charAt(20));
			}
			catch(StringIndexOutOfBoundsException s) {
				System.out.println(s.getMessage());
			}
		}
	}
}
