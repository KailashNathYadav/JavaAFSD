abstract class Bike {
	public abstract void run();
}

class Bullet extends Bike{
	public void run() {
		System.out.println("Bullet is running.");
	}
}

class Main{
	public static void main(String[] args) {
		Bike bullet = new Bullet();
		bullet.run();
	}
}


------------------------------------------------------------------

interface Bike{
	void run();
}

class Bullet implements Bike{
	public void run(){
		System.out.println("Bullet is running");
	}
}

class Main{
	public static void main(String[] args) {
		Bike bullet = new Bullet();
		bullet.run();
	}
}