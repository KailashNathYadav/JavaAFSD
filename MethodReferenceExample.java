import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class ForReference {
    // Static method for method reference  =>  ClassName :: staticMethod
    public static void printName(String name) {
        System.out.println(name);
    }

    // Instance method method reference   =>   objName :: instanceMethod
    public void printNumber(Integer number) {
        System.out.println(number);
    }

    //Constructor for method reference  =>  ClassName :: new
    public ForReference() {
        System.out.println("Default constructor !!!!!!!");
    }
    
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        // Reference to a static method
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(ForReference::printName);

        // Reference to an instance method of a particular object
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(new ForReference()::printNumber);

        // Reference to a constructor
        Supplier<ForReference> supplier = ForReference::new;
        ForReference obj = supplier.get();
        
    }
}
