class ClassA {
	public void method1() {
		System.out.println("ClassA , method1");
	}
}

class ClassB extends ClassA{
	public void method2() {
		System.out.println("ClassB , method2");
	}
}

class ClassC extends ClassB{
	public void method3() {
		System.out.println("ClassC , method3");
	}
}

class Main{
	public static void main(String[] args) {
		ClassC obj = new ClassC();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}