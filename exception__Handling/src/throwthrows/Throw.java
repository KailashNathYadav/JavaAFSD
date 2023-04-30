package throwthrows;

public class Throw {
	public static void main(String[] args){
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			//you can throw from any block
			throw new ArithmeticException("Become infinity");
		}
	}
}
