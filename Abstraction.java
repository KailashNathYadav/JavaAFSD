//Example 1 For abstraction using abstract class(0% to 100% abstraction).

abstract class Shape{
	abstract void area(int r);
}

class Circle extends Shape{
	void area(int r){
		System.out.println(22/7 * r * r);
	}
}

class Main{
	public static void main(String[] args){
		Shape c = new  Circle();
		c.area(7);
	}
}

//Example 2 For abstraction using interface(100% abstraction).

abstract class Bike {
	abstract void run();
}

class Bullet extends Bike{
	void run() {
		System.out.println("Bullet is running.");
	}
}

class Main{
	public static void main(String[] args) {
		Bike bullet = new Bullet();
		bullet.run();
	}
}
