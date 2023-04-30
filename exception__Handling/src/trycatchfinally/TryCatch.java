package trycatchfinally;
import java.util.*;
public class TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int deno = sc.nextInt();
			System.out.println(10 / deno);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
