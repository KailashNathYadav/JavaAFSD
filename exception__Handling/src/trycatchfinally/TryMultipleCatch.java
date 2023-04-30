package trycatchfinally;

import java.util.Scanner;

public class TryMultipleCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int deno = sc.nextInt();
		String h = "hello";
		try {
			System.out.println(10/deno);
			System.out.println(h.charAt(5));
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		catch(StringIndexOutOfBoundsException sioobs) {
			System.out.println(sioobs.getMessage());
		}
		finally {
			System.out.println("You rock it.");
		}
	}
}
