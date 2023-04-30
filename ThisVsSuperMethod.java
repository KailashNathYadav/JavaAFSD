class A{
    public A(){
        System.out.println("Default constructor A");
    }
    public A(int n){
        System.out.println("Permeterized Constructor A");
    }
}

class B extends A{
    public B(){
        System.out.println("Default constructor B");
    }
    public B(int n){
        // super();
        this();
        System.out.println("Permeterized Constructor B");
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B(0);
    }
}
