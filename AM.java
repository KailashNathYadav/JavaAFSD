package package1;

public class SameClass {
//	default - with same package.
//	public - everywhere, private - within the class.
//	protected - within same package or subclass of different package.
//  cannot make a static reference to the non-static field
	static int defaultAtt = 1;
	public static float publicAtt = 1.0F;
	private static char privateAtt = 'c';
	protected static boolean protectedAtt = true;
	public static void main(String[] args) {
		System.out.println(defaultAtt);
		System.out.println(publicAtt);
		System.out.println(privateAtt);
		System.out.println(protectedAtt);
	}
}

package package1;

public class SamePackSub extends SameClass{
	public static void main(String[] args) {
		System.out.println(defaultAtt);
		System.out.println(publicAtt);
//		System.out.println(privateAtt);
		System.out.println(protectedAtt);
	}
}

package package1;

public class SamePackNonSub {
	public static void main(String[] args) {
		System.out.println(SameClass.defaultAtt);
		System.out.println(SameClass.publicAtt);
//		System.out.println(SameClass.privateAtt);
		System.out.println(SameClass.protectedAtt);
	}
}


package package2;

import package1.SameClass;

public class DiffPackSub extends SameClass{
	public static void main(String[] args) {
//		System.out.println(defaultAtt);
		System.out.println(publicAtt);
//		System.out.println(privateAtt);
		System.out.println(protectedAtt);
	}
}


package package2;
import package1.SameClass;

public class DiffPackNonSub {
	public static void main(String[] args) {
//		System.out.println(SameClass.defaultAtt);
		System.out.println(SameClass.publicAtt);
//		System.out.println(SameClass.privateAtt);
//		System.out.println(SameClass.protectedAtt);
	}
}
