package trycatchfinally;

public class TryPipedCatch {
	public static void main(String[] args) {
		try {
			System.out.println("hello".charAt(5));
			System.out.println(10/0);
		} catch (ArithmeticException | StringIndexOutOfBoundsException aAS) {
			System.out.println("Either arithmetic or out of bound exception.");
		}
	}
}
