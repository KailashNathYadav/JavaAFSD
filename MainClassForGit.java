public class MainClassForGit {

	public static void main(String[] args) {
		String res = "  iAmGreatLearningPlatform";
		System.out.println(res);
		System.out.println(res.toLowerCase());
		System.out.println(res.toUpperCase());
		System.out.println(res.length());
		System.out.println(res.charAt(3));
		System.out.println(res.startsWith("  iAmGreat"));
		System.out.println(res.endsWith("Form"));
		System.out.println(res.trim());
		System.out.println(res.compareTo(res));
		System.out.println(res.compareTo("I am feeling proud of me."));
		System.out.println(res.compareTo("   iamjoking"));
	}

}